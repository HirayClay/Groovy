package closure

/**
 * Created by SEELE on 2017/8/14.
 */
class Father {

    void work() {
        def whatIsThisObject = { getThisObject() }
        assert whatIsThisObject() == this
        def whatIsThis = { this }
        assert whatIsThis() == this

        def whatIsOwnerMethod = { getOwner() }
        assert whatIsOwnerMethod() == this
        def whatIsOwner = { owner }
        assert whatIsOwner() == this
    }


    void check() {
        def getOwner = { owner.class.name }
        println getOwner()==Father.class.name

        def OuterCl = {
            def nestedCl = {
                owner.class.name
            }

            nestedCl()
        }



        println OuterCl() == OuterCl.class.name
    }
}
