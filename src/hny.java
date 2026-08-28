import java.util.List;
import java.util.function.Function;

public class hny implements gtp {
   private final btd<gtp> a;
   private final hlc b;

   public hny(btd<gtp> $$0) {
      this.a = $$0;
      gtp $$1 = $$0.d().getFirst().a();
      this.b = $$1.a();
   }

   @Override
   public hlc a() {
      return this.b;
   }

   @Override
   public void a(azz $$0, List<gto> $$1) {
      this.a.b($$0).a($$0, $$1);
   }

   public static record a(btd<gtp.b> d) implements gtp.b {
      @Override
      public gtp a(hnl $$0) {
         return new hny(this.d.a((Function<gtp.b, gtp>)($$1 -> $$1.a($$0))));
      }

      @Override
      public void a(hnt.a $$0) {
         this.d.d().forEach($$1 -> $$1.a().a($$0));
      }

      public btd<gtp.b> b() {
         return this.d;
      }
   }
}
