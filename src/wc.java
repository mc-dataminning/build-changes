import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class wc implements vr {
   private String a = "";
   @Nullable
   private vu b;
   private final Deque<Consumer<vu>> c = new ArrayDeque<>();

   @Nullable
   public vu d() {
      return this.b;
   }

   protected int e() {
      return this.c.size();
   }

   private void a(vu $$0) {
      this.c.getLast().accept($$0);
   }

   @Override
   public vr.b a() {
      this.a(uz.b);
      return vr.b.a;
   }

   @Override
   public vr.b a(String $$0) {
      this.a(vs.a($$0));
      return vr.b.a;
   }

   @Override
   public vr.b a(byte $$0) {
      this.a(uv.a($$0));
      return vr.b.a;
   }

   @Override
   public vr.b a(short $$0) {
      this.a(vp.a($$0));
      return vr.b.a;
   }

   @Override
   public vr.b a(int $$0) {
      this.a(vc.a($$0));
      return vr.b.a;
   }

   @Override
   public vr.b a(long $$0) {
      this.a(vf.a($$0));
      return vr.b.a;
   }

   @Override
   public vr.b a(float $$0) {
      this.a(va.a($$0));
      return vr.b.a;
   }

   @Override
   public vr.b a(double $$0) {
      this.a(uy.a($$0));
      return vr.b.a;
   }

   @Override
   public vr.b a(byte[] $$0) {
      this.a(new uu($$0));
      return vr.b.a;
   }

   @Override
   public vr.b a(int[] $$0) {
      this.a(new vb($$0));
      return vr.b.a;
   }

   @Override
   public vr.b a(long[] $$0) {
      this.a(new ve($$0));
      return vr.b.a;
   }

   @Override
   public vr.b a(vw<?> $$0, int $$1) {
      return vr.b.a;
   }

   @Override
   public vr.a b(vw<?> $$0, int $$1) {
      this.c($$0);
      return vr.a.a;
   }

   @Override
   public vr.a a(vw<?> $$0) {
      return vr.a.a;
   }

   @Override
   public vr.a a(vw<?> $$0, String $$1) {
      this.a = $$1;
      this.c($$0);
      return vr.a.a;
   }

   private void c(vw<?> $$0) {
      if ($$0 == vd.a) {
         vd $$1 = new vd();
         this.a($$1);
         this.c.addLast($$1::add);
      } else if ($$0 == ux.b) {
         ux $$2 = new ux();
         this.a($$2);
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      }
   }

   @Override
   public vr.b b() {
      this.c.removeLast();
      return vr.b.a;
   }

   @Override
   public vr.b b(vw<?> $$0) {
      if ($$0 == vd.a) {
         vd $$1 = new vd();
         this.b = $$1;
         this.c.addLast($$1::add);
      } else if ($$0 == ux.b) {
         ux $$2 = new ux();
         this.b = $$2;
         this.c.addLast($$1 -> $$2.a(this.a, $$1));
      } else {
         this.c.addLast($$0x -> this.b = $$0x);
      }

      return vr.b.a;
   }
}
