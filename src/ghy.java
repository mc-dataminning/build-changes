import java.util.List;

public class ghy<T extends chy, M extends fqr<T>> extends ghm<T, M> {
   private final ajh a;
   private final ghy.a<T> b;
   private final ghy.b<T, M> c;

   public ghy(gew<T, M> $$0, ajh $$1, ghy.a<T> $$2, ghy.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(eub $$0, fxs $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         this.a();
         euf $$10 = $$1.getBuffer(fya.j(this.a));
         this.c().a($$0, $$10, $$2, gec.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<frf> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends chy> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends chy, M extends foe<T>> {
      List<frf> getPartsToDraw(M var1);
   }
}
