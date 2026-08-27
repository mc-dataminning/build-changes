import java.util.List;

public class gfx<T extends cgp, M extends fov<T>> extends gfl<T, M> {
   private final aiy a;
   private final gfx.a<T> b;
   private final gfx.b<T, M> c;

   public gfx(gcv<T, M> $$0, aiy $$1, gfx.a<T> $$2, gfx.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(esh $$0, fvt $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         this.a();
         esl $$10 = $$1.getBuffer(fwb.j(this.a));
         this.c().a($$0, $$10, $$2, gcb.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fpj> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends cgp> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends cgp, M extends fmi<T>> {
      List<fpj> getPartsToDraw(M var1);
   }
}
