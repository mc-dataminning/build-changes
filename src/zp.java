import javax.annotation.Nullable;

public class zp implements wb<xu> {
   private final int a;
   private final cgu<?> b;
   private final ui c;

   public zp(int $$0, cgu<?> $$1, ui $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public zp(tl $$0) {
      this.a = $$0.n();
      this.b = $$0.a(jy.s);
      this.c = $$0.m();
   }

   @Override
   public void a(tl $$0) {
      $$0.c(this.a);
      $$0.a(jy.s, this.b);
      $$0.a(this.c);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public cgu<?> d() {
      return this.b;
   }

   public ui e() {
      return this.c;
   }
}
