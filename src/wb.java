import java.util.List;

public record wb(List<gv> b) implements vo {
   public static final aep a = new aep("debug/raids");

   public wb(sh $$0) {
      this($$0.a(sh::e));
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.b, sh::a);
   }

   @Override
   public aep a() {
      return a;
   }
}
