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

public class hgg extends awa<hgg.a> {
   public static final alz a = alz.b("empty");
   public static final hey b = new hey(a, bsf.a(1.0F), bsf.a(1.0F), 1, hey.a.a, false, false, 16);
   public static final alz c = alz.b("intentionally_empty");
   public static final hgh d = new hgh(c, null);
   public static final hey e = new hey(c, bsf.a(1.0F), bsf.a(1.0F), 1, hey.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(xv.class, new xv.b(ke.b)).registerTypeAdapter(hez.class, new hfa()).create();
   private static final TypeToken<Map<String, hez>> i = new TypeToken<Map<String, hez>>() {
   };
   private final Map<alz, hgh> j = Maps.newHashMap();
   private final hgd k;
   private final Map<alz, avt> l = new HashMap<>();

   public hgg(fmd $$0) {
      this.k = new hgd(this, $$0, avy.fromMap(this.l));
   }

   protected hgg.a a(avv $$0, bpo $$1) {
      hgg.a $$2 = new hgg.a();

      try (bpt $$3 = $$1.d("list")) {
         $$2.a($$0);
      }

      for (String $$4 : $$0.a()) {
         try (bpt $$5 = $$1.d($$4)) {
            for (avt $$7 : $$0.a(alz.a($$4, "sounds.json"))) {
               $$1.a($$7.b());

               try (Reader $$8 = $$7.e()) {
                  $$1.a("parse");
                  Map<String, hez> $$9 = azu.a(h, $$8, i);
                  $$1.b("register");

                  for (Entry<String, hez> $$10 : $$9.entrySet()) {
                     $$2.a(alz.a($$4, $$10.getKey()), $$10.getValue());
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

   protected void a(hgg.a $$0, avv $$1, bpo $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ab.aU) {
         for (alz $$3 : this.j.keySet()) {
            hgh $$4 = this.j.get($$3);
            if (!xy.b($$4.a()) && ma.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (alz $$5 : this.j.keySet()) {
            if (!ma.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.h();
   }

   public fea b() {
      return this.k.i();
   }

   static boolean a(hey $$0, alz $$1, avy $$2) {
      alz $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hgh a(alz $$0) {
      return this.j.get($$0);
   }

   public Collection<alz> d() {
      return this.j.keySet();
   }

   public void a(hfc $$0) {
      this.k.a($$0);
   }

   public void a(hfb $$0) {
      this.k.c($$0);
   }

   public void a(hfb $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(fli $$0) {
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

   public void a(axg $$0, float $$1) {
      if ($$0 == axg.a && $$1 <= 0.0F) {
         this.f();
      }

      this.k.a($$0, $$1);
   }

   public void b(hfb $$0) {
      this.k.a($$0);
   }

   public boolean c(hfb $$0) {
      return this.k.b($$0);
   }

   public void a(hgf $$0) {
      this.k.a($$0);
   }

   public void b(hgf $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable alz $$0, @Nullable axg $$1) {
      this.k.a($$0, $$1);
   }

   public String j() {
      return this.k.g();
   }

   public void k() {
      this.k.a();
   }

   protected static class a {
      final Map<alz, hgh> a = Maps.newHashMap();
      private Map<alz, avt> b = Map.of();

      void a(avv $$0) {
         this.b = hey.a.a($$0);
      }

      void a(alz $$0, hez $$1) {
         hgh $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hgg.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hgh($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         avy $$4 = avy.fromMap(this.b);

         for (final hey $$5 : $$1.a()) {
            final alz $$6 = $$5.a();
            hgi<hey> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hgg.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hgi<hey>() {
                     @Override
                     public int e() {
                        hgh $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public hey a(bam $$0) {
                        hgh $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return hgg.b;
                        } else {
                           hey $$2 = $$1.a($$0);
                           return new hey($$2.a(), new bsl($$2.c(), $$5.c()), new bsl($$2.d(), $$5.d()), $$5.e(), hey.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hgd $$0) {
                        hgh $$1 = a.this.a.get($$6);
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

      public void a(Map<alz, hgh> $$0, Map<alz, avt> $$1, hgd $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<alz, hgh> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
