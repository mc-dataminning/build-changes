import javax.annotation.Nullable;

public class na extends mo {
   final coj<?> a;

   public na(coj<?> $$0) {
      this.a = $$0;
   }

   public static na a(coj<? extends cnv> $$0) {
      return new na($$0);
   }

   public void a(ms $$0, String $$1) {
      this.a($$0, new agg($$1));
   }

   public void a(ms $$0, final agg $$1) {
      $$0.a(new mo.a(cnu.d) {
         @Override
         public coj<?> c() {
            return na.this.a;
         }

         @Override
         public agg b() {
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
