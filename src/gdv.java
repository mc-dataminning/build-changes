import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gdv {
   private final eqn a;
   @Nullable
   private gdw b;
   private final List<gdv.a> c = Lists.newArrayList();
   private final gdo d;

   public gdv(eqn $$0, eqr $$1) {
      this.a = $$0;
      this.d = new gdo(this, $$1);
   }

   public void a(fmg $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fie $$0, @Nullable ehd $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fie $$0, gv $$1, dey $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(ciw $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void b() {
      if (this.b != null) {
         this.b.b();
         this.b = null;
      }
   }

   public void c() {
      if (this.b != null) {
         this.b();
      }

      this.b = this.a.m.r.a(this);
   }

   public void a(eul $$0, int $$1) {
      this.c.add(new gdv.a($$0, $$1));
      this.a.ay().a($$0);
   }

   public void a(eul $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gdv.a::a);
      if (this.b != null) {
         if (this.a.s != null) {
            this.b.a();
         } else {
            this.b();
         }
      } else if (this.a.s != null) {
         this.c();
      }
   }

   public void a(gdx $$0) {
      this.a.m.r = $$0;
      this.a.m.aq();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public eqn e() {
      return this.a;
   }

   public boolean f() {
      return this.a.r == null ? false : this.a.r.l() == cph.a;
   }

   public static te a(String $$0) {
      return te.d("key." + $$0).a(n.r);
   }

   public void a(ciw $$0, ciw $$1, cek $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final eul a;
      private final int b;
      private int c;

      a(eul $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private boolean a() {
         this.a.a(Math.min((float)(++this.c) / (float)this.b, 1.0F));
         if (this.c > this.b) {
            this.a.c();
            return true;
         } else {
            return false;
         }
      }
   }
}
