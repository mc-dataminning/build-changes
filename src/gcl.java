import java.util.List;

public class gcl<T extends cdv, M extends flk<T>> extends gbz<T, M> {
   private final agt a;
   private final gcl.a<T> b;
   private final gcl.b<T, M> c;

   public gcl(fzj<T, M> $$0, agt $$1, gcl.a<T> $$2, gcl.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(epd $$0, fsi $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         this.a();
         eph $$10 = $$1.getBuffer(fsq.j(this.a));
         this.c().a($$0, $$10, $$2, fyp.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fly> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends cdv> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends cdv, M extends fiy<T>> {
      List<fly> getPartsToDraw(M var1);
   }
}
