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

public class grf extends att<grf.a> {
   public static final gpy a = new gpy("minecraft:empty", bnr.a(1.0F), bnr.a(1.0F), 1, gpy.a.a, false, false, 16);
   public static final akf b = new akf("minecraft", "intentionally_empty");
   public static final grg c = new grg(b, null);
   public static final gpy d = new gpy(b.toString(), bnr.a(1.0F), bnr.a(1.0F), 1, gpy.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(ws.class, new ws.b(jj.b)).registerTypeAdapter(gpz.class, new gqa()).create();
   private static final TypeToken<Map<String, gpz>> h = new TypeToken<Map<String, gpz>>() {
   };
   private final Map<akf, grg> i = Maps.newHashMap();
   private final grc j;
   private final Map<akf, atm> k = new HashMap<>();

   public grf(fcy $$0) {
      this.j = new grc(this, $$0, atr.fromMap(this.k));
   }

   protected grf.a a(ato $$0, ble $$1) {
      grf.a $$2 = new grf.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (atm $$5 : $$0.a(new akf($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gpz> $$7 = axm.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gpz> $$8 : $$7.entrySet()) {
                     $$2.a(new akf($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(grf.a $$0, ato $$1, ble $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aX) {
         for (akf $$3 : this.i.keySet()) {
            grg $$4 = this.i.get($$3);
            if (!wv.b($$4.a()) && lc.b.d($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (akf $$5 : this.i.keySet()) {
            if (!lc.b.d($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   public evk b() {
      return this.j.i();
   }

   static boolean a(gpy $$0, akf $$1, atr $$2) {
      akf $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public grg a(akf $$0) {
      return this.i.get($$0);
   }

   public Collection<akf> d() {
      return this.i.keySet();
   }

   public void a(gqc $$0) {
      this.j.a($$0);
   }

   public void a(gqb $$0) {
      this.j.c($$0);
   }

   public void a(gqb $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(fcf $$0) {
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

   public void a(ava $$0, float $$1) {
      if ($$0 == ava.a && $$1 <= 0.0F) {
         this.f();
      }

      this.j.a($$0, $$1);
   }

   public void b(gqb $$0) {
      this.j.a($$0);
   }

   public boolean c(gqb $$0) {
      return this.j.b($$0);
   }

   public void a(gre $$0) {
      this.j.a($$0);
   }

   public void b(gre $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable akf $$0, @Nullable ava $$1) {
      this.j.a($$0, $$1);
   }

   public String j() {
      return this.j.g();
   }

   public void k() {
      this.j.a();
   }

   protected static class a {
      final Map<akf, grg> a = Maps.newHashMap();
      private Map<akf, atm> b = Map.of();

      void a(ato $$0) {
         this.b = gpy.a.a($$0);
      }

      void a(akf $$0, gpz $$1) {
         grg $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               grf.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new grg($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         atr $$4 = atr.fromMap(this.b);

         for (final gpy $$5 : $$1.a()) {
            final akf $$6 = $$5.a();
            grh<gpy> $$8;
            switch ($$5.f()) {
               case a:
                  if (!grf.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new grh<gpy>() {
                     @Override
                     public int e() {
                        grg $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gpy a(ayd $$0) {
                        grg $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return grf.a;
                        } else {
                           gpy $$2 = $$1.a($$0);
                           return new gpy(
                              $$2.a().toString(), new bnx($$2.c(), $$5.c()), new bnx($$2.d(), $$5.d()), $$5.e(), gpy.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(grc $$0) {
                        grg $$1 = a.this.a.get($$6);
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

      public void a(Map<akf, grg> $$0, Map<akf, atm> $$1, grc $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<akf, grg> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
