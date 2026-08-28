import java.util.Set;
import javax.annotation.Nullable;

public class glb implements gli.a {
   public static final alz a = gli.a;
   public static final alz b = alz.b("translucent");
   public static final alz c = alz.b("item_entity");
   public static final alz d = alz.b("particles");
   public static final alz e = alz.b("weather");
   public static final alz f = alz.b("clouds");
   public static final alz g = alz.b("entity_outline");
   public static final Set<alz> h = Set.of(a);
   public static final Set<alz> i = Set.of(a, g);
   public static final Set<alz> j = Set.of(a, b, c, d, e, f);
   public ffx<fev> k = ffx.a();
   @Nullable
   public ffx<fev> l;
   @Nullable
   public ffx<fev> m;
   @Nullable
   public ffx<fev> n;
   @Nullable
   public ffx<fev> o;
   @Nullable
   public ffx<fev> p;
   @Nullable
   public ffx<fev> q;

   @Override
   public void a(alz $$0, ffx<fev> $$1) {
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
   public ffx<fev> a(alz $$0) {
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
      this.k = ffx.a();
      this.l = null;
      this.m = null;
      this.n = null;
      this.o = null;
      this.p = null;
      this.q = null;
   }
}
