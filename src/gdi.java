import java.util.List;

public class gdi<T extends cel, M extends fmh<T>> extends gcw<T, M> {
   private final ahg a;
   private final gdi.a<T> b;
   private final gdi.b<T, M> c;

   public gdi(gag<T, M> $$0, ahg $$1, gdi.a<T> $$2, gdi.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(epz $$0, ftf $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         this.a();
         eqd $$10 = $$1.getBuffer(ftn.j(this.a));
         this.c().a($$0, $$10, $$2, fzm.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fmv> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends cel> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends cel, M extends fjv<T>> {
      List<fmv> getPartsToDraw(M var1);
   }
}
