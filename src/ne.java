import javax.annotation.Nullable;

public class ne extends ms {
   final cox<?> a;

   public ne(cox<?> $$0) {
      this.a = $$0;
   }

   public static ne a(cox<? extends coi> $$0) {
      return new ne($$0);
   }

   public void a(mw $$0, String $$1) {
      this.a($$0, new agm($$1));
   }

   public void a(mw $$0, final agm $$1) {
      $$0.a(new ms.a(coh.d) {
         @Override
         public cox<?> c() {
            return ne.this.a;
         }

         @Override
         public agm b() {
            return $$1;
         }

         @Nullable
         @Override
         public af d() {
            return null;
         }
      });
   }
}
