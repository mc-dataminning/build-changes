import javax.annotation.Nullable;

public class my extends mm {
   final cnq<?> a;

   public my(cnq<?> $$0) {
      this.a = $$0;
   }

   public static my a(cnq<? extends cnd> $$0) {
      return new my($$0);
   }

   public void a(mq $$0, String $$1) {
      this.a($$0, new afw($$1));
   }

   public void a(mq $$0, final afw $$1) {
      $$0.a(new mm.a(cnc.d) {
         @Override
         public cnq<?> c() {
            return my.this.a;
         }

         @Override
         public afw b() {
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
