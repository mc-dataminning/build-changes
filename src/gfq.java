import java.util.List;

public class gfq<T extends cgl, M extends fon<T>> extends gfe<T, M> {
   private final aiy a;
   private final gfq.a<T> b;
   private final gfq.b<T, M> c;

   public gfq(gco<T, M> $$0, aiy $$1, gfq.a<T> $$2, gfq.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(esa $$0, fvm $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         this.a();
         ese $$10 = $$1.getBuffer(fvu.j(this.a));
         this.c().a($$0, $$10, $$2, gbu.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fpc> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends cgl> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends cgl, M extends fmb<T>> {
      List<fpc> getPartsToDraw(M var1);
   }
}
