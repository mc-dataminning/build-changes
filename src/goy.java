import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class goy implements goo {
   protected final List<gcb> a;
   protected final Map<ir, List<gcb>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gmo f;
   protected final gcn g;
   protected final gcl h;

   public goy(List<gcb> $$0, Map<ir, List<gcb>> $$1, boolean $$2, boolean $$3, boolean $$4, gmo $$5, gcn $$6, gcl $$7) {
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
   public List<gcb> a(@Nullable dpy $$0, @Nullable ir $$1, ayd $$2) {
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
   public gmo e() {
      return this.f;
   }

   @Override
   public gcn f() {
      return this.g;
   }

   @Override
   public gcl g() {
      return this.h;
   }

   public static class a {
      private final List<gcb> a = Lists.newArrayList();
      private final Map<ir, List<gcb>> b = Maps.newEnumMap(ir.class);
      private final gcl c;
      private final boolean d;
      private gmo e;
      private final boolean f;
      private final boolean g;
      private final gcn h;

      public a(gcg $$0, gcl $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, gcn $$3, gcl $$4) {
         for (ir $$5 : ir.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public goy.a a(ir $$0, gcb $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public goy.a a(gcb $$0) {
         this.a.add($$0);
         return this;
      }

      public goy.a a(gmo $$0) {
         this.e = $$0;
         return this;
      }

      public goy.a a() {
         return this;
      }

      public goo b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new goy(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
