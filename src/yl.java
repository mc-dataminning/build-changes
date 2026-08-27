import javax.annotation.Nullable;

public class yl implements ux<wp> {
   private final int a;
   private final cfj<?> b;
   private final tf c;

   public yl(int $$0, cfj<?> $$1, tf $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public yl(si $$0) {
      this.a = $$0.m();
      this.b = $$0.a(jb.s);
      this.c = $$0.l();
   }

   @Override
   public void a(si $$0) {
      $$0.c(this.a);
      $$0.a(jb.s, this.b);
      $$0.a(this.c);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public cfj<?> d() {
      return this.b;
   }

   public tf e() {
      return this.c;
   }
}
