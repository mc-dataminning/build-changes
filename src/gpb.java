import java.util.List;

public class gpb<T extends clz, M extends fxq<T>> extends gop<T, M> {
   private final akq a;
   private final gpb.a<T> b;
   private final gpb.b<T, M> c;

   public gpb(glz<T, M> $$0, akq $$1, gpb.a<T> $$2, gpb.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(fbc $$0, get $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ci()) {
         this.a();
         fbg $$10 = $$1.getBuffer(gfb.j(this.a));
         float $$11 = this.b.apply($$3, $$6, $$7);
         int $$12 = axx.b.a(ayn.d($$11 * 255.0F), 255, 255, 255);
         this.c().a($$0, $$10, $$2, gle.c($$3, 0.0F), $$12);
         this.b();
      }
   }

   private void a() {
      List<fye> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends clz> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends clz, M extends fve<T>> {
      List<fye> getPartsToDraw(M var1);
   }
}
