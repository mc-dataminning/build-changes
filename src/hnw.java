import java.util.List;
import java.util.function.Function;

public class hnw implements gtn {
   private final btb<gtn> a;
   private final hla b;

   public hnw(btb<gtn> $$0) {
      this.a = $$0;
      gtn $$1 = $$0.d().getFirst().a();
      this.b = $$1.a();
   }

   @Override
   public hla a() {
      return this.b;
   }

   @Override
   public void a(azx $$0, List<gtm> $$1) {
      this.a.b($$0).a($$0, $$1);
   }

   public static record a(btb<gtn.b> d) implements gtn.b {
      @Override
      public gtn a(hnj $$0) {
         return new hnw(this.d.a((Function<gtn.b, gtn>)($$1 -> $$1.a($$0))));
      }

      @Override
      public void a(hnr.a $$0) {
         this.d.d().forEach($$1 -> $$1.a().a($$0));
      }

      public btb<gtn.b> b() {
         return this.d;
      }
   }
}
