import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gnt implements gnj {
   protected final List<gaw> a;
   protected final Map<ih, List<gaw>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final glj f;
   protected final gbi g;
   protected final gbg h;

   public gnt(List<gaw> $$0, Map<ih, List<gaw>> $$1, boolean $$2, boolean $$3, boolean $$4, glj $$5, gbi $$6, gbg $$7) {
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
   public List<gaw> a(@Nullable doz $$0, @Nullable ih $$1, axr $$2) {
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
   public glj e() {
      return this.f;
   }

   @Override
   public gbi f() {
      return this.g;
   }

   @Override
   public gbg g() {
      return this.h;
   }

   public static class a {
      private final List<gaw> a = Lists.newArrayList();
      private final Map<ih, List<gaw>> b = Maps.newEnumMap(ih.class);
      private final gbg c;
      private final boolean d;
      private glj e;
      private final boolean f;
      private final boolean g;
      private final gbi h;

      public a(gbb $$0, gbg $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, gbi $$3, gbg $$4) {
         for (ih $$5 : ih.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gnt.a a(ih $$0, gaw $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gnt.a a(gaw $$0) {
         this.a.add($$0);
         return this;
      }

      public gnt.a a(glj $$0) {
         this.e = $$0;
         return this;
      }

      public gnt.a a() {
         return this;
      }

      public gnj b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gnt(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
