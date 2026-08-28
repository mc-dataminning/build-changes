import java.util.List;
import java.util.function.Function;

public class gvt<S extends gyo, M extends gbh<S>> extends gwa<S, M> {
   private final alp a;
   private final gvt.a<S> b;
   private final gvt.b<S, M> c;
   private final Function<alp, glq> d;

   public gvt(gti<S, M> $$0, alp $$1, gvt.a<S> $$2, gvt.b<S, M> $$3, Function<alp, glq> $$4) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
   }

   public void a(fgl $$0, glg $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.u) {
         if (this.a($$3)) {
            fgp $$6 = $$1.getBuffer(this.d.apply(this.a));
            float $$7 = this.b.apply($$3, $$3.p);
            int $$8 = ayf.a(azu.d($$7 * 255.0F), 255, 255, 255);
            this.d().a($$0, $$6, $$2, gsm.a($$3, 0.0F), $$8);
            this.a();
         }
      }
   }

   private boolean a(S $$0) {
      List<gej> $$1 = this.c.getPartsToDraw(this.d(), $$0);
      if ($$1.isEmpty()) {
         return false;
      } else {
         this.d().f().forEach($$0x -> $$0x.l = true);
         $$1.forEach($$0x -> $$0x.l = false);
         return true;
      }
   }

   private void a() {
      this.d().f().forEach($$0 -> $$0.l = false);
   }

   public interface a<S extends gyo> {
      float apply(S var1, float var2);
   }

   public interface b<S extends gyo, M extends gbh<S>> {
      List<gej> getPartsToDraw(M var1, S var2);
   }
}
