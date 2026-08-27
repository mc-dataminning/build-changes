import javax.annotation.Nullable;

public class zj implements vd<ww> {
   @Nullable
   private final aew a;

   public zj(@Nullable aew $$0) {
      this.a = $$0;
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public zj(so $$0) {
      this.a = $$0.c(so::s);
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, so::a);
   }

   @Nullable
   public aew a() {
      return this.a;
   }
}
