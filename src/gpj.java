import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gpj implements goz {
   protected final List<gcl> a;
   protected final Map<is, List<gcl>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gmy f;
   protected final gcx g;
   protected final gcv h;

   public gpj(List<gcl> $$0, Map<is, List<gcl>> $$1, boolean $$2, boolean $$3, boolean $$4, gmy $$5, gcx $$6, gcv $$7) {
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
   public List<gcl> a(@Nullable dqh $$0, @Nullable is $$1, ayg $$2) {
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
   public gmy e() {
      return this.f;
   }

   @Override
   public gcx f() {
      return this.g;
   }

   @Override
   public gcv g() {
      return this.h;
   }

   public static class a {
      private final List<gcl> a = Lists.newArrayList();
      private final Map<is, List<gcl>> b = Maps.newEnumMap(is.class);
      private final gcv c;
      private final boolean d;
      private gmy e;
      private final boolean f;
      private final boolean g;
      private final gcx h;

      public a(gcq $$0, gcv $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, gcx $$3, gcv $$4) {
         for (is $$5 : is.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gpj.a a(is $$0, gcl $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gpj.a a(gcl $$0) {
         this.a.add($$0);
         return this;
      }

      public gpj.a a(gmy $$0) {
         this.e = $$0;
         return this;
      }

      public gpj.a a() {
         return this;
      }

      public goz b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gpj(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
