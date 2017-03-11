package edu.muc.marking.dao.bean;

/**
 * version    date      author
 * ──────────────────────────────────
 * 1.0       17-3-5   wanlong.ma
 * Description:
 * Others:
 * Function List:
 * History:
 */
public class Academy extends Base {
    private int academy_id;
    private String academy_name;

    public int getAcademy_id() {
        return academy_id;
    }

    public void setAcademy_id(int academy_id) {
        this.academy_id = academy_id;
    }

    public String getAcademy_name() {
        return academy_name;
    }

    public void setAcademy_name(String academy_name) {
        this.academy_name = academy_name;
    }

    @Override
    public String toString() {
        return "Academy{" +
                "academy_id=" + academy_id +
                ", academy_name='" + academy_name + '\'' +
                '}';
    }
}
