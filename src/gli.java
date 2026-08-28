import java.util.Set;
import javax.annotation.Nullable;

public class gli implements glp.a {
   public static final alz a = glp.a;
   public static final alz b = alz.b("translucent");
   public static final alz c = alz.b("item_entity");
   public static final alz d = alz.b("particles");
   public static final alz e = alz.b("weather");
   public static final alz f = alz.b("clouds");
   public static final alz g = alz.b("entity_outline");
   public static final Set<alz> h = Set.of(a);
   public static final Set<alz> i = Set.of(a, g);
   public static final Set<alz> j = Set.of(a, b, c, d, e, f);
   public fge<ffc> k = fge.a();
   @Nullable
   public fge<ffc> l;
   @Nullable
   public fge<ffc> m;
   @Nullable
   public fge<ffc> n;
   @Nullable
   public fge<ffc> o;
   @Nullable
   public fge<ffc> p;
   @Nullable
   public fge<ffc> q;

   @Override
   public void a(alz $$0, fge<ffc> $$1) {
      if ($$0.equals(a)) {
         this.k = $$1;
      } else if ($$0.equals(b)) {
         this.l = $$1;
      } else if ($$0.equals(c)) {
         this.m = $$1;
      } else if ($$0.equals(d)) {
         this.n = $$1;
      } else if ($$0.equals(e)) {
         this.o = $$1;
      } else if ($$0.equals(f)) {
         this.p = $$1;
      } else {
         if (!$$0.equals(g)) {
            throw new IllegalArgumentException("No target with id " + $$0);
         }

         this.q = $$1;
      }
   }

   @Nullable
   @Override
   public fge<ffc> a(alz $$0) {
      if ($$0.equals(a)) {
         return this.k;
      } else if ($$0.equals(b)) {
         return this.l;
      } else if ($$0.equals(c)) {
         return this.m;
      } else if ($$0.equals(d)) {
         return this.n;
      } else if ($$0.equals(e)) {
         return this.o;
      } else if ($$0.equals(f)) {
         return this.p;
      } else {
         return $$0.equals(g) ? this.q : null;
      }
   }

   public void a() {
      this.k = fge.a();
      this.l = null;
      this.m = null;
      this.n = null;
      this.o = null;
      this.p = null;
      this.q = null;
   }
}
