import java.util.Set;
import javax.annotation.Nullable;

public class ghd implements ghk.a {
   public static final alc a = ghk.a;
   public static final alc b = alc.b("translucent");
   public static final alc c = alc.b("item_entity");
   public static final alc d = alc.b("particles");
   public static final alc e = alc.b("weather");
   public static final alc f = alc.b("clouds");
   public static final alc g = alc.b("entity_outline");
   public static final Set<alc> h = Set.of(a);
   public static final Set<alc> i = Set.of(a, g);
   public static final Set<alc> j = Set.of(a, b, c, d, e, f);
   public fcq<fbo> k = fcq.a();
   @Nullable
   public fcq<fbo> l;
   @Nullable
   public fcq<fbo> m;
   @Nullable
   public fcq<fbo> n;
   @Nullable
   public fcq<fbo> o;
   @Nullable
   public fcq<fbo> p;
   @Nullable
   public fcq<fbo> q;

   @Override
   public void a(alc $$0, fcq<fbo> $$1) {
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
   public fcq<fbo> a(alc $$0) {
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
      this.k = fcq.a();
      this.l = null;
      this.m = null;
      this.n = null;
      this.o = null;
      this.p = null;
      this.q = null;
   }
}
