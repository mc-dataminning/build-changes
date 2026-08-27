import java.util.List;

public record wj(List<gw> b) implements vw {
   public static final aex a = new aex("debug/raids");

   public wj(so $$0) {
      this($$0.a(so::e));
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.b, so::a);
   }

   @Override
   public aex a() {
      return a;
   }
}
