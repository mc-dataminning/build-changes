import java.util.List;
import java.util.function.Function;

public class hnm implements gta {
   private final btm<gta> a;
   private final hkq b;

   public hnm(btm<gta> $$0) {
      this.a = $$0;
      gta $$1 = $$0.d().getFirst().a();
      this.b = $$1.a();
   }

   @Override
   public hkq a() {
      return this.b;
   }

   @Override
   public void a(bai $$0, List<gsz> $$1) {
      this.a.b($$0).a($$0, $$1);
   }

   public static record a(btm<gta.b> d) implements gta.b {
      @Override
      public gta a(hmz $$0) {
         return new hnm(this.d.a((Function<gta.b, gta>)($$1 -> $$1.a($$0))));
      }

      @Override
      public void a(hnh.a $$0) {
         this.d.d().forEach($$1 -> $$1.a().a($$0));
      }

      public btm<gta.b> b() {
         return this.d;
      }
   }
}
