import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gri implements gqy {
   protected final List<gej> a;
   protected final Map<je, List<gej>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gox f;
   protected final gev g;
   protected final get h;

   public gri(List<gej> $$0, Map<je, List<gej>> $$1, boolean $$2, boolean $$3, boolean $$4, gox $$5, gev $$6, get $$7) {
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
   public List<gej> a(@Nullable dsa $$0, @Nullable je $$1, azf $$2) {
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
   public gox e() {
      return this.f;
   }

   @Override
   public gev f() {
      return this.g;
   }

   @Override
   public get g() {
      return this.h;
   }

   public static class a {
      private final List<gej> a = Lists.newArrayList();
      private final Map<je, List<gej>> b = Maps.newEnumMap(je.class);
      private final get c;
      private final boolean d;
      private gox e;
      private final boolean f;
      private final boolean g;
      private final gev h;

      public a(geo $$0, get $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, gev $$3, get $$4) {
         for (je $$5 : je.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gri.a a(je $$0, gej $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gri.a a(gej $$0) {
         this.a.add($$0);
         return this;
      }

      public gri.a a(gox $$0) {
         this.e = $$0;
         return this;
      }

      public gri.a a() {
         return this;
      }

      public gqy b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gri(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
