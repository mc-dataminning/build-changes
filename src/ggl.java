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

public class ggl extends apq<ggl.a> {
   public static final gfe a = new gfe("minecraft:empty", bic.a(1.0F), bic.a(1.0F), 1, gfe.a.a, false, false, 16);
   public static final agm b = new agm("minecraft", "intentionally_empty");
   public static final ggm c = new ggm(b, null);
   public static final gfe d = new gfe(b.toString(), bic.a(1.0F), bic.a(1.0F), 1, gfe.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(uv.class, new uv.b()).registerTypeAdapter(gff.class, new gfg()).create();
   private static final TypeToken<Map<String, gff>> h = new TypeToken<Map<String, gff>>() {
   };
   private final Map<agm, ggm> i = Maps.newHashMap();
   private final ggi j;
   private final Map<agm, apj> k = new HashMap<>();

   public ggl(etm $$0) {
      this.j = new ggi(this, $$0, apo.fromMap(this.k));
   }

   protected ggl.a a(apl $$0, bfs $$1) {
      ggl.a $$2 = new ggl.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (apj $$5 : $$0.a(new agm($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gff> $$7 = atg.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gff> $$8 : $$7.entrySet()) {
                     $$2.a(new agm($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(ggl.a $$0, apl $$1, bfs $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aT) {
         for (agm $$3 : this.i.keySet()) {
            ggm $$4 = this.i.get($$3);
            if (!uy.b($$4.a()) && kc.c.c($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (agm $$5 : this.i.keySet()) {
            if (!kc.c.c($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   static boolean a(gfe $$0, agm $$1, apo $$2) {
      agm $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public ggm a(agm $$0) {
      return this.i.get($$0);
   }

   public Collection<agm> b() {
      return this.i.keySet();
   }

   public void a(gfi $$0) {
      this.j.a($$0);
   }

   public void a(gfh $$0) {
      this.j.c($$0);
   }

   public void a(gfh $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(est $$0) {
      this.j.a($$0);
   }

   public void d() {
      this.j.e();
   }

   public void e() {
      this.j.d();
   }

   public void f() {
      this.j.b();
   }

   public void g() {
      this.j.c();
   }

   public void a(boolean $$0) {
      this.j.a($$0);
   }

   public void h() {
      this.j.f();
   }

   public void a(aqw $$0, float $$1) {
      if ($$0 == aqw.a && $$1 <= 0.0F) {
         this.e();
      }

      this.j.a($$0, $$1);
   }

   public void b(gfh $$0) {
      this.j.a($$0);
   }

   public boolean c(gfh $$0) {
      return this.j.b($$0);
   }

   public void a(ggk $$0) {
      this.j.a($$0);
   }

   public void b(ggk $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable agm $$0, @Nullable aqw $$1) {
      this.j.a($$0, $$1);
   }

   public String i() {
      return this.j.g();
   }

   public void j() {
      this.j.a();
   }

   protected static class a {
      final Map<agm, ggm> a = Maps.newHashMap();
      private Map<agm, apj> b = Map.of();

      void a(apl $$0) {
         this.b = gfe.a.a($$0);
      }

      void a(agm $$0, gff $$1) {
         ggm $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               ggl.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new ggm($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         apo $$4 = apo.fromMap(this.b);

         for (final gfe $$5 : $$1.a()) {
            final agm $$6 = $$5.a();
            ggn<gfe> $$8;
            switch ($$5.f()) {
               case a:
                  if (!ggl.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new ggn<gfe>() {
                     @Override
                     public int e() {
                        ggm $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gfe a(atw $$0) {
                        ggm $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return ggl.a;
                        } else {
                           gfe $$2 = $$1.a($$0);
                           return new gfe(
                              $$2.a().toString(), new bii($$2.c(), $$5.c()), new bii($$2.d(), $$5.d()), $$5.e(), gfe.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(ggi $$0) {
                        ggm $$1 = a.this.a.get($$6);
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

      public void a(Map<agm, ggm> $$0, Map<agm, apj> $$1, ggi $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<agm, ggm> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
