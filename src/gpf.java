import java.util.List;

public class gpf<T extends cmb, M extends fxu<T>> extends got<T, M> {
   private final akr a;
   private final gpf.a<T> b;
   private final gpf.b<T, M> c;

   public gpf(gmd<T, M> $$0, akr $$1, gpf.a<T> $$2, gpf.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(fbg $$0, gex $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ci()) {
         this.a();
         fbk $$10 = $$1.getBuffer(gff.j(this.a));
         float $$11 = this.b.apply($$3, $$6, $$7);
         int $$12 = axy.b.a(ayo.d($$11 * 255.0F), 255, 255, 255);
         this.c().a($$0, $$10, $$2, gli.c($$3, 0.0F), $$12);
         this.b();
      }
   }

   private void a() {
      List<fyi> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends cmb> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends cmb, M extends fvi<T>> {
      List<fyi> getPartsToDraw(M var1);
   }
}
