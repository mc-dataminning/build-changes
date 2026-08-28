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

public class hjw extends auu<hjw.a> {
   public static final akv a = akv.b("empty");
   public static final hin b = new hin(a, brm.a(1.0F), brm.a(1.0F), 1, hin.a.a, false, false, 16);
   public static final akv c = akv.b("intentionally_empty");
   public static final hjx d = new hjx(c, null);
   public static final hin e = new hin(c, brm.a(1.0F), brm.a(1.0F), 1, hin.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(wp.class, new wp.b(kf.b)).registerTypeAdapter(hio.class, new hip()).create();
   private static final TypeToken<Map<String, hio>> i = new TypeToken<Map<String, hio>>() {
   };
   private final Map<akv, hjx> j = Maps.newHashMap();
   private final hjt k;
   private final Map<akv, aun> l = new HashMap<>();

   public hjw(flo $$0) {
      this.k = new hjt(this, $$0, aus.fromMap(this.l));
   }

   protected hjw.a a(aup $$0, bou $$1) {
      hjw.a $$2 = new hjw.a();

      try (boz $$3 = $$1.d("list")) {
         $$2.a($$0);
      }

      for (String $$4 : $$0.a()) {
         try (boz $$5 = $$1.d($$4)) {
            for (aun $$7 : $$0.a(akv.a($$4, "sounds.json"))) {
               $$1.a($$7.b());

               try (Reader $$8 = $$7.e()) {
                  $$1.a("parse");
                  Map<String, hio> $$9 = ayp.a(h, $$8, i);
                  $$1.b("register");

                  for (Entry<String, hio> $$10 : $$9.entrySet()) {
                     $$2.a(akv.a($$4, $$10.getKey()), $$10.getValue());
                  }

                  $$1.c();
               } catch (RuntimeException var19) {
                  f.warn("Invalid {} in resourcepack: '{}'", new Object[]{"sounds.json", $$7.b(), var19});
               }

               $$1.c();
            }
         } catch (IOException var21) {
         }
      }

      return $$2;
   }

   protected void a(hjw.a $$0, aup $$1, bou $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ab.aU) {
         for (akv $$3 : this.j.keySet()) {
            hjx $$4 = this.j.get($$3);
            if (!ws.b($$4.a()) && mb.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (akv $$5 : this.j.keySet()) {
            if (!mb.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.h();
   }

   public fdk b() {
      return this.k.i();
   }

   static boolean a(hin $$0, akv $$1, aus $$2) {
      akv $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hjx a(akv $$0) {
      return this.j.get($$0);
   }

   public Collection<akv> d() {
      return this.j.keySet();
   }

   public void a(hir $$0) {
      this.k.a($$0);
   }

   public void a(hiq $$0) {
      this.k.c($$0);
   }

   public void a(hiq $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(fks $$0) {
      this.k.a($$0);
   }

   public void e() {
      this.k.e();
   }

   public void f() {
      this.k.d();
   }

   public void g() {
      this.k.b();
   }

   public void h() {
      this.k.c();
   }

   public void a(boolean $$0) {
      this.k.a($$0);
   }

   public void i() {
      this.k.f();
   }

   public void a(awb $$0, float $$1) {
      if ($$0 == awb.a && $$1 <= 0.0F) {
         this.f();
      }

      this.k.a($$0, $$1);
   }

   public void b(hiq $$0) {
      this.k.a($$0);
   }

   public void a(hiq $$0, float $$1) {
      this.k.a($$0, $$1);
   }

   public boolean c(hiq $$0) {
      return this.k.b($$0);
   }

   public void a(hjv $$0) {
      this.k.a($$0);
   }

   public void b(hjv $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable akv $$0, @Nullable awb $$1) {
      this.k.a($$0, $$1);
   }

   public String j() {
      return this.k.g();
   }

   public void k() {
      this.k.a();
   }

   protected static class a {
      final Map<akv, hjx> a = Maps.newHashMap();
      private Map<akv, aun> b = Map.of();

      void a(aup $$0) {
         this.b = hin.a.a($$0);
      }

      void a(akv $$0, hio $$1) {
         hjx $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hjw.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hjx($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         aus $$4 = aus.fromMap(this.b);

         for (final hin $$5 : $$1.a()) {
            final akv $$6 = $$5.a();
            hjy<hin> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hjw.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hjy<hin>() {
                     @Override
                     public int e() {
                        hjx $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public hin a(azh $$0) {
                        hjx $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return hjw.b;
                        } else {
                           hin $$2 = $$1.a($$0);
                           return new hin($$2.a(), new brs($$2.c(), $$5.c()), new brs($$2.d(), $$5.d()), $$5.e(), hin.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hjt $$0) {
                        hjx $$1 = a.this.a.get($$6);
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

      public void a(Map<akv, hjx> $$0, Map<akv, aun> $$1, hjt $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<akv, hjx> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
