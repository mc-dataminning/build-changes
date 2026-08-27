import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gnq extends ast<gnq.a> {
   public static final gmj a = new gmj("minecraft:empty", bmd.a(1.0F), bmd.a(1.0F), 1, gmj.a.a, false, false, 16);
   public static final ajh b = new ajh("minecraft", "intentionally_empty");
   public static final gnr c = new gnr(b, null);
   public static final gmj d = new gmj(b.toString(), bmd.a(1.0F), bmd.a(1.0F), 1, gmj.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(vu.class, new vu.b()).registerTypeAdapter(gmk.class, new gml()).create();
   private static final TypeToken<Map<String, gmk>> h = new TypeToken<Map<String, gmk>>() {
   };
   private final Map<ajh, gnr> i = Maps.newHashMap();
   private final gnn j;
   private final Map<ajh, asm> k = new HashMap<>();

   public gnq(ezk $$0) {
      this.j = new gnn(this, $$0, asr.fromMap(this.k));
   }

   protected gnq.a a(aso $$0, bjq $$1) {
      gnq.a $$2 = new gnq.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (asm $$5 : $$0.a(new ajh($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gmk> $$7 = awm.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gmk> $$8 : $$7.entrySet()) {
                     $$2.a(new ajh($$3, $$8.getKey()), $$8.getValue());
                  }

                  $$1.c();
               } catch (RuntimeException var15) {
                  e.warn("Invalid {} in resourcepack: '{}'", new Object[]{"sounds.json", $$5.b(), var15});
               }

               $$1.c();
            }
         } catch (IOException var16) {
         }

         $$1.c();
      }

      $$1.b();
      return $$2;
   }

   protected void a(gnq.a $$0, aso $$1, bjq $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aW) {
         for (ajh $$3 : this.i.keySet()) {
            gnr $$4 = this.i.get($$3);
            if (!vx.b($$4.a()) && ki.b.d($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (ajh $$5 : this.i.keySet()) {
            if (!ki.b.d($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   public erw b() {
      return this.j.i();
   }

   static boolean a(gmj $$0, ajh $$1, asr $$2) {
      ajh $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gnr a(ajh $$0) {
      return this.i.get($$0);
   }

   public Collection<ajh> d() {
      return this.i.keySet();
   }

   public void a(gmn $$0) {
      this.j.a($$0);
   }

   public void a(gmm $$0) {
      this.j.c($$0);
   }

   public void a(gmm $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(eyr $$0) {
      this.j.a($$0);
   }

   public void e() {
      this.j.e();
   }

   public void f() {
      this.j.d();
   }

   public void g() {
      this.j.b();
   }

   public void h() {
      this.j.c();
   }

   public void a(boolean $$0) {
      this.j.a($$0);
   }

   public void i() {
      this.j.f();
   }

   public void a(atz $$0, float $$1) {
      if ($$0 == atz.a && $$1 <= 0.0F) {
         this.f();
      }

      this.j.a($$0, $$1);
   }

   public void b(gmm $$0) {
      this.j.a($$0);
   }

   public boolean c(gmm $$0) {
      return this.j.b($$0);
   }

   public void a(gnp $$0) {
      this.j.a($$0);
   }

   public void b(gnp $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable ajh $$0, @Nullable atz $$1) {
      this.j.a($$0, $$1);
   }

   public String j() {
      return this.j.g();
   }

   public void k() {
      this.j.a();
   }

   protected static class a {
      final Map<ajh, gnr> a = Maps.newHashMap();
      private Map<ajh, asm> b = Map.of();

      void a(aso $$0) {
         this.b = gmj.a.a($$0);
      }

      void a(ajh $$0, gmk $$1) {
         gnr $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gnq.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gnr($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         asr $$4 = asr.fromMap(this.b);

         for (final gmj $$5 : $$1.a()) {
            final ajh $$6 = $$5.a();
            gns<gmj> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gnq.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gns<gmj>() {
                     @Override
                     public int e() {
                        gnr $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gmj a(axd $$0) {
                        gnr $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gnq.a;
                        } else {
                           gmj $$2 = $$1.a($$0);
                           return new gmj(
                              $$2.a().toString(), new bmj($$2.c(), $$5.c()), new bmj($$2.d(), $$5.d()), $$5.e(), gmj.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gnn $$0) {
                        gnr $$1 = a.this.a.get($$6);
                        if ($$1 != null) {
                           $$1.a($$0);
                        }
                     }
                  };
                  break;
               default:
                  throw new IllegalStateException("Unknown SoundEventRegistration type: " + $$5.f());
            }

            $$2.a($$8);
         }
      }

      public void a(Map<ajh, gnr> $$0, Map<ajh, asm> $$1, gnn $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<ajh, gnr> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
