import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;

public record fyc(boolean a, float b, float c, float d, float e, float f, Set<String> g) implements gcl {
   public fyc(Set<String> $$0) {
      this(false, 5.0F, 2.0F, $$0);
   }

   public fyc(boolean $$0, float $$1, float $$2, Set<String> $$3) {
      this($$0, $$1, $$2, 2.0F, 2.0F, 24.0F, $$3);
   }

   @Override
   public gck apply(gck $$0) {
      float $$1 = this.a ? 1.5F / this.d : 1.0F;
      float $$2 = 1.0F / this.e;
      UnaryOperator<gce> $$3 = $$1x -> $$1x.c(0.0F, this.b, this.c).b($$1);
      UnaryOperator<gce> $$4 = $$1x -> $$1x.c(0.0F, this.f, 0.0F).b($$2);
      gck $$5 = new gck();

      for (Entry<String, gcm> $$6 : $$0.a().a()) {
         String $$7 = $$6.getKey();
         gcm $$8 = $$6.getValue();
         $$5.a().a($$7, $$8.a(this.g.contains($$7) ? $$3 : $$4));
      }

      return $$5;
   }
}
