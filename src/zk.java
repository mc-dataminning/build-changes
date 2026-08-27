import javax.annotation.Nullable;

public class zk implements vd<ww> {
   @Nullable
   private final aex a;

   public zk(@Nullable aex $$0) {
      this.a = $$0;
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public zk(so $$0) {
      this.a = $$0.c(so::s);
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, so::a);
   }

   @Nullable
   public aex a() {
      return this.a;
   }
}
