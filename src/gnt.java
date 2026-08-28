import java.util.List;

public class gnt<T extends clz, M extends fwk<T>> extends gnh<T, M> {
   private final ale a;
   private final gnt.a<T> b;
   private final gnt.b<T, M> c;

   public gnt(gkr<T, M> $$0, ale $$1, gnt.a<T> $$2, gnt.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(ezw $$0, gdm $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch()) {
         this.a();
         faa $$10 = $$1.getBuffer(gdu.j(this.a));
         this.c().a($$0, $$10, $$2, gjw.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fwy> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends clz> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends clz, M extends fty<T>> {
      List<fwy> getPartsToDraw(M var1);
   }
}
