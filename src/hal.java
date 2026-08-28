import java.util.List;
import java.util.function.Function;

public class hal implements hay {
   private final ali a;
   private List<gjx> b = List.of();

   public hal(ali $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hay.a $$0) {
      if ($$0.a(this.a) instanceof gjt $$2) {
         this.b = $$2.e();
         this.b.forEach($$1 -> $$0.a($$1.a()));
      }
   }

   @Override
   public haf a(hao $$0, Function<ham, gyd> $$1, hau $$2) {
      haf $$3 = $$0.a(this.a, $$2);
      if (this.b.isEmpty()) {
         return $$3;
      } else {
         gjn $$4 = new gjn($$0, this.b);
         return new hal.a($$3, $$4);
      }
   }

   static class a extends haj {
      private final gjn b;

      public a(haf $$0, gjn $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      public gjn g() {
         return this.b;
      }
   }
}
