import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gef implements gdv {
   protected final List<frr> a;
   protected final Map<hx, List<frr>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gbu f;
   protected final fsd g;
   protected final fsb h;

   public gef(List<frr> $$0, Map<hx, List<frr>> $$1, boolean $$2, boolean $$3, boolean $$4, gbu $$5, fsd $$6, fsb $$7) {
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
   public List<frr> a(@Nullable dhi $$0, @Nullable hx $$1, ats $$2) {
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
   public gbu e() {
      return this.f;
   }

   @Override
   public fsd f() {
      return this.g;
   }

   @Override
   public fsb g() {
      return this.h;
   }

   public static class a {
      private final List<frr> a = Lists.newArrayList();
      private final Map<hx, List<frr>> b = Maps.newEnumMap(hx.class);
      private final fsb c;
      private final boolean d;
      private gbu e;
      private final boolean f;
      private final boolean g;
      private final fsd h;

      public a(frw $$0, fsb $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, fsd $$3, fsb $$4) {
         for (hx $$5 : hx.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gef.a a(hx $$0, frr $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gef.a a(frr $$0) {
         this.a.add($$0);
         return this;
      }

      public gef.a a(gbu $$0) {
         this.e = $$0;
         return this;
      }

      public gef.a a() {
         return this;
      }

      public gdv b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gef(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
