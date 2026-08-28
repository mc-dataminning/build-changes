import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class fxt extends fum {
   private static final int a = 20;
   private static final int b = 5;
   private static final int c = 20;
   private final wp d;
   private final List<wp> s;
   private final ImmutableList<fxt.a> u;
   private fpn v = fpn.a;
   private int w;
   private int x;

   protected fxt(wp $$0, List<wp> $$1, ImmutableList<fxt.a> $$2) {
      super($$0);
      this.s = $$1;
      this.d = wo.a($$0, ws.a($$1, wo.a));
      this.u = $$2;
   }

   @Override
   public wp i() {
      return this.d;
   }

   @Override
   public void aR_() {
      UnmodifiableIterator $$1 = this.u.iterator();

      while ($$1.hasNext()) {
         fxt.a $$0 = (fxt.a)$$1.next();
         this.x = Math.max(this.x, 20 + this.p.a($$0.a) + 20);
      }

      int $$1x = 5 + this.x + 5;
      int $$2 = $$1x * this.u.size();
      this.v = fpn.a(this.p, $$2, this.s.toArray(new wp[0]));
      int $$3 = this.v.a() * 9;
      this.w = (int)((double)this.o / 2.0 - (double)$$3 / 2.0);
      int $$4 = this.w + $$3 + 9 * 2;
      int $$5 = (int)((double)this.n / 2.0 - (double)$$2 / 2.0);

      for (UnmodifiableIterator var6 = this.u.iterator(); var6.hasNext(); $$5 += $$1x) {
         fxt.a $$6 = (fxt.a)var6.next();
         this.c(fou.a($$6.a, $$6.b).a($$5, $$4, this.x, 20).a());
      }
   }

   @Override
   public void a(fof $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.w - 9 * 2, -1);
      this.v.a($$0, this.n / 2, this.w);
   }

   @Override
   public boolean aG_() {
      return false;
   }

   public static final class a {
      final wp a;
      final fou.c b;

      public a(wp $$0, fou.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
