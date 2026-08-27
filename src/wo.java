import javax.annotation.Nullable;

public class wo implements uo<ur> {
   private final int a;
   private final cck<?> b;
   private final sw c;

   public wo(int $$0, cck<?> $$1, sw $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public wo(sf $$0) {
      this.a = $$0.m();
      this.b = $$0.a(jb.s);
      this.c = $$0.l();
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.a);
      $$0.a(jb.s, this.b);
      $$0.a(this.c);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public cck<?> c() {
      return this.b;
   }

   public sw d() {
      return this.c;
   }
}
