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

public class gia extends apx<gia.a> {
   public static final ggt a = new ggt("minecraft:empty", bim.a(1.0F), bim.a(1.0F), 1, ggt.a.a, false, false, 16);
   public static final agt b = new agt("minecraft", "intentionally_empty");
   public static final gib c = new gib(b, null);
   public static final ggt d = new ggt(b.toString(), bim.a(1.0F), bim.a(1.0F), 1, ggt.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(vb.class, new vb.b()).registerTypeAdapter(ggu.class, new ggv()).create();
   private static final TypeToken<Map<String, ggu>> h = new TypeToken<Map<String, ggu>>() {
   };
   private final Map<agt, gib> i = Maps.newHashMap();
   private final ghx j;
   private final Map<agt, apq> k = new HashMap<>();

   public gia(euo $$0) {
      this.j = new ghx(this, $$0, apv.fromMap(this.k));
   }

   protected gia.a a(aps $$0, bgc $$1) {
      gia.a $$2 = new gia.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (apq $$5 : $$0.a(new agt($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, ggu> $$7 = ato.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, ggu> $$8 : $$7.entrySet()) {
                     $$2.a(new agt($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gia.a $$0, aps $$1, bgc $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aW) {
         for (agt $$3 : this.i.keySet()) {
            gib $$4 = this.i.get($$3);
            if (!ve.b($$4.a()) && kb.b.c($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (agt $$5 : this.i.keySet()) {
            if (!kb.b.c($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   static boolean a(ggt $$0, agt $$1, apv $$2) {
      agt $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gib a(agt $$0) {
      return this.i.get($$0);
   }

   public Collection<agt> b() {
      return this.i.keySet();
   }

   public void a(ggx $$0) {
      this.j.a($$0);
   }

   public void a(ggw $$0) {
      this.j.c($$0);
   }

   public void a(ggw $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(etv $$0) {
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

   public void a(ard $$0, float $$1) {
      if ($$0 == ard.a && $$1 <= 0.0F) {
         this.e();
      }

      this.j.a($$0, $$1);
   }

   public void b(ggw $$0) {
      this.j.a($$0);
   }

   public boolean c(ggw $$0) {
      return this.j.b($$0);
   }

   public void a(ghz $$0) {
      this.j.a($$0);
   }

   public void b(ghz $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable agt $$0, @Nullable ard $$1) {
      this.j.a($$0, $$1);
   }

   public String i() {
      return this.j.g();
   }

   public void j() {
      this.j.a();
   }

   protected static class a {
      final Map<agt, gib> a = Maps.newHashMap();
      private Map<agt, apq> b = Map.of();

      void a(aps $$0) {
         this.b = ggt.a.a($$0);
      }

      void a(agt $$0, ggu $$1) {
         gib $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gia.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gib($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         apv $$4 = apv.fromMap(this.b);

         for (final ggt $$5 : $$1.a()) {
            final agt $$6 = $$5.a();
            gic<ggt> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gia.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gic<ggt>() {
                     @Override
                     public int e() {
                        gib $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public ggt a(auf $$0) {
                        gib $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gia.a;
                        } else {
                           ggt $$2 = $$1.a($$0);
                           return new ggt(
                              $$2.a().toString(), new bis($$2.c(), $$5.c()), new bis($$2.d(), $$5.d()), $$5.e(), ggt.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(ghx $$0) {
                        gib $$1 = a.this.a.get($$6);
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

      public void a(Map<agt, gib> $$0, Map<agt, apq> $$1, ghx $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<agt, gib> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
