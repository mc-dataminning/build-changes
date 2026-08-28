import java.util.List;
import java.util.function.Function;

public class haa implements han {
   private final alh a;
   private List<gjm> b = List.of();

   public haa(alh $$0) {
      this.a = $$0;
   }

   @Override
   public void a(han.a $$0) {
      if ($$0.a(this.a) instanceof gji $$2) {
         this.b = $$2.e();
         this.b.forEach($$1 -> $$0.a($$1.a()));
      }
   }

   @Override
   public gzu a(had $$0, Function<hab, gxs> $$1, haj $$2) {
      gzu $$3 = $$0.a(this.a, $$2);
      if (this.b.isEmpty()) {
         return $$3;
      } else {
         gjc $$4 = new gjc($$0, this.b);
         return new haa.a($$3, $$4);
      }
   }

   static class a extends gzy {
      private final gjc b;

      public a(gzu $$0, gjc $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      public gjc g() {
         return this.b;
      }
   }
}
