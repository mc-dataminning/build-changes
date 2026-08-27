import java.util.List;

public class gaw<T extends cdd, M extends fkg<T>> extends gak<T, M> {
   private final agm a;
   private final gaw.a<T> b;
   private final gaw.b<T, M> c;

   public gaw(fxx<T, M> $$0, agm $$1, gaw.a<T> $$2, gaw.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(eob $$0, fqz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         this.a();
         eof $$10 = $$1.getBuffer(frh.j(this.a));
         this.c().a($$0, $$10, $$2, fxd.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fkt> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends cdd> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends cdd, M extends fhu<T>> {
      List<fkt> getPartsToDraw(M var1);
   }
}
