package semantics

/**
 * Created by SEELE on 2017/8/25.
 */
class Coordination {
    def lat
    def lot

    Coordination(lat, lot) {
        this.lat = lat
        this.lot = lot
    }

    def putAt(int index, float value) {
        switch (index) {
            case 0:
                lat = value
                break
            case 1:
                lot = value
                break
        }
    }

    def getAt(int index){
        switch (index) {
            case 0:
              return lat
            case 1:
                return lot
        }
    }
}
