import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class grf implements gqv {
   protected final List<geg> a;
   protected final Map<je, List<geg>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gou f;
   protected final ges g;
   protected final geq h;

   public grf(List<geg> $$0, Map<je, List<geg>> $$1, boolean $$2, boolean $$3, boolean $$4, gou $$5, ges $$6, geq $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$4;
      this.e = $$3;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }

   @Override
   public List<geg> a(@Nullable drx $$0, @Nullable je $$1, azc $$2) {
      return $$1 == null ? this.a : this.b.get($$1);
   }

   @Override
   public boolean a() {
      return this.c;
   }

   @Override
   public boolean b() {
      return this.d;
   }

   @Override
   public boolean c() {
      return this.e;
   }

   @Override
   public boolean d() {
      return false;
   }

   @Override
   public gou e() {
      return this.f;
   }

   @Override
   public ges f() {
      return this.g;
   }

   @Override
   public geq g() {
      return this.h;
   }

   public static class a {
      private final List<geg> a = Lists.newArrayList();
      private final Map<je, List<geg>> b = Maps.newEnumMap(je.class);
      private final geq c;
      private final boolean d;
      private gou e;
      private final boolean f;
      private final boolean g;
      private final ges h;

      public a(gel $$0, geq $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, ges $$3, geq $$4) {
         for (je $$5 : je.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public grf.a a(je $$0, geg $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public grf.a a(geg $$0) {
         this.a.add($$0);
         return this;
      }

      public grf.a a(gou $$0) {
         this.e = $$0;
         return this;
      }

      public grf.a a() {
         return this;
      }

      public gqv b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new grf(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
