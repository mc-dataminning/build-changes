import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gcl implements gcb {
   protected final List<fpx> a;
   protected final Map<hx, List<fpx>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gaa f;
   protected final fqj g;
   protected final fqh h;

   public gcl(List<fpx> $$0, Map<hx, List<fpx>> $$1, boolean $$2, boolean $$3, boolean $$4, gaa $$5, fqj $$6, fqh $$7) {
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
   public List<fpx> a(@Nullable dgb $$0, @Nullable hx $$1, ate $$2) {
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
   public gaa e() {
      return this.f;
   }

   @Override
   public fqj f() {
      return this.g;
   }

   @Override
   public fqh g() {
      return this.h;
   }

   public static class a {
      private final List<fpx> a = Lists.newArrayList();
      private final Map<hx, List<fpx>> b = Maps.newEnumMap(hx.class);
      private final fqh c;
      private final boolean d;
      private gaa e;
      private final boolean f;
      private final boolean g;
      private final fqj h;

      public a(fqc $$0, fqh $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, fqj $$3, fqh $$4) {
         for (hx $$5 : hx.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gcl.a a(hx $$0, fpx $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gcl.a a(fpx $$0) {
         this.a.add($$0);
         return this;
      }

      public gcl.a a(gaa $$0) {
         this.e = $$0;
         return this;
      }

      public gcl.a a() {
         return this;
      }

      public gcb b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gcl(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
