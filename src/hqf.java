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

public class hqf extends avm<hqf.a> {
   public static final alk a = alk.b("empty");
   public static final how b = new how(a, btu.a(1.0F), btu.a(1.0F), 1, how.a.a, false, false, 16);
   public static final alk c = alk.b("intentionally_empty");
   public static final hqg d = new hqg(c, null);
   public static final how e = new how(c, btu.a(1.0F), btu.a(1.0F), 1, how.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(xc.class, new xc.b(ju.b)).registerTypeAdapter(hox.class, new hoy()).create();
   private static final TypeToken<Map<String, hox>> i = new TypeToken<Map<String, hox>>() {
   };
   private final Map<alk, hqg> j = Maps.newHashMap();
   private final hqc k;
   private final Map<alk, avf> l = new HashMap<>();

   public hqf(frj $$0) {
      this.k = new hqc(this, $$0, avk.fromMap(this.l));
   }

   protected hqf.a a(avh $$0, brd $$1) {
      hqf.a $$2 = new hqf.a();

      try (bri $$3 = $$1.d("list")) {
         $$2.a($$0);
      }

      for (String $$4 : $$0.a()) {
         try (bri $$5 = $$1.d($$4)) {
            for (avf $$7 : $$0.a(alk.a($$4, "sounds.json"))) {
               $$1.a($$7.b());

               try (Reader $$8 = $$7.e()) {
                  $$1.a("parse");
                  Map<String, hox> $$9 = azg.a(h, $$8, i);
                  $$1.b("register");

                  for (Entry<String, hox> $$10 : $$9.entrySet()) {
                     $$2.a(alk.a($$4, $$10.getKey()), $$10.getValue());
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

   protected void a(hqf.a $$0, avh $$1, brd $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ac.aU) {
         for (alk $$3 : this.j.keySet()) {
            hqg $$4 = this.j.get($$3);
            if (!xf.b($$4.a()) && mh.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (alk $$5 : this.j.keySet()) {
            if (!mh.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.h();
   }

   public fic b() {
      return this.k.i();
   }

   static boolean a(how $$0, alk $$1, avk $$2) {
      alk $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hqg a(alk $$0) {
      return this.j.get($$0);
   }

   public Collection<alk> c() {
      return this.j.keySet();
   }

   public void a(hpa $$0) {
      this.k.a($$0);
   }

   public void a(hoz $$0) {
      this.k.c($$0);
   }

   public void a(hoz $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(fqn $$0) {
      this.k.a($$0);
   }

   public void d() {
      this.k.e();
   }

   public void e() {
      this.k.d();
   }

   public void f() {
      this.k.b();
   }

   public void g() {
      this.k.c();
   }

   public void a(boolean $$0) {
      this.k.a($$0);
   }

   public void h() {
      this.k.f();
   }

   public void a(aws $$0, float $$1) {
      if ($$0 == aws.a && $$1 <= 0.0F) {
         this.e();
      }

      this.k.a($$0, $$1);
   }

   public void b(hoz $$0) {
      this.k.a($$0);
   }

   public void a(hoz $$0, float $$1) {
      this.k.a($$0, $$1);
   }

   public boolean c(hoz $$0) {
      return this.k.b($$0);
   }

   public void a(hqe $$0) {
      this.k.a($$0);
   }

   public void b(hqe $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable alk $$0, @Nullable aws $$1) {
      this.k.a($$0, $$1);
   }

   public String i() {
      return this.k.g();
   }

   public void j() {
      this.k.a();
   }

   protected static class a {
      final Map<alk, hqg> a = Maps.newHashMap();
      private Map<alk, avf> b = Map.of();

      void a(avh $$0) {
         this.b = how.a.a($$0);
      }

      void a(alk $$0, hox $$1) {
         hqg $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hqf.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hqg($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         avk $$4 = avk.fromMap(this.b);

         for (final how $$5 : $$1.a()) {
            final alk $$6 = $$5.a();
            hqh<how> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hqf.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hqh<how>() {
                     @Override
                     public int e() {
                        hqg $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public how a(azz $$0) {
                        hqg $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return hqf.b;
                        } else {
                           how $$2 = $$1.a($$0);
                           return new how($$2.a(), new bua($$2.c(), $$5.c()), new bua($$2.d(), $$5.d()), $$5.e(), how.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hqc $$0) {
                        hqg $$1 = a.this.a.get($$6);
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

      public void a(Map<alk, hqg> $$0, Map<alk, avf> $$1, hqc $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<alk, hqg> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
