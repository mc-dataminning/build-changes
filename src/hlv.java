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

public class hlv extends avf<hlv.a> {
   public static final ald a = ald.b("empty");
   public static final hkm b = new hkm(a, bsr.a(1.0F), bsr.a(1.0F), 1, hkm.a.a, false, false, 16);
   public static final ald c = ald.b("intentionally_empty");
   public static final hlw d = new hlw(c, null);
   public static final hkm e = new hkm(c, bsr.a(1.0F), bsr.a(1.0F), 1, hkm.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(wv.class, new wv.b(kg.b)).registerTypeAdapter(hkn.class, new hko()).create();
   private static final TypeToken<Map<String, hkn>> i = new TypeToken<Map<String, hkn>>() {
   };
   private final Map<ald, hlw> j = Maps.newHashMap();
   private final hls k;
   private final Map<ald, auy> l = new HashMap<>();

   public hlv(fnh $$0) {
      this.k = new hls(this, $$0, avd.fromMap(this.l));
   }

   protected hlv.a a(ava $$0, bqb $$1) {
      hlv.a $$2 = new hlv.a();

      try (bqg $$3 = $$1.d("list")) {
         $$2.a($$0);
      }

      for (String $$4 : $$0.a()) {
         try (bqg $$5 = $$1.d($$4)) {
            for (auy $$7 : $$0.a(ald.a($$4, "sounds.json"))) {
               $$1.a($$7.b());

               try (Reader $$8 = $$7.e()) {
                  $$1.a("parse");
                  Map<String, hkn> $$9 = aza.a(h, $$8, i);
                  $$1.b("register");

                  for (Entry<String, hkn> $$10 : $$9.entrySet()) {
                     $$2.a(ald.a($$4, $$10.getKey()), $$10.getValue());
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

   protected void a(hlv.a $$0, ava $$1, bqb $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ab.aU) {
         for (ald $$3 : this.j.keySet()) {
            hlw $$4 = this.j.get($$3);
            if (!wy.b($$4.a()) && md.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (ald $$5 : this.j.keySet()) {
            if (!md.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.h();
   }

   public ffd b() {
      return this.k.i();
   }

   static boolean a(hkm $$0, ald $$1, avd $$2) {
      ald $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hlw a(ald $$0) {
      return this.j.get($$0);
   }

   public Collection<ald> d() {
      return this.j.keySet();
   }

   public void a(hkq $$0) {
      this.k.a($$0);
   }

   public void a(hkp $$0) {
      this.k.c($$0);
   }

   public void a(hkp $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(fml $$0) {
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

   public void a(awl $$0, float $$1) {
      if ($$0 == awl.a && $$1 <= 0.0F) {
         this.f();
      }

      this.k.a($$0, $$1);
   }

   public void b(hkp $$0) {
      this.k.a($$0);
   }

   public void a(hkp $$0, float $$1) {
      this.k.a($$0, $$1);
   }

   public boolean c(hkp $$0) {
      return this.k.b($$0);
   }

   public void a(hlu $$0) {
      this.k.a($$0);
   }

   public void b(hlu $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable ald $$0, @Nullable awl $$1) {
      this.k.a($$0, $$1);
   }

   public String j() {
      return this.k.g();
   }

   public void k() {
      this.k.a();
   }

   protected static class a {
      final Map<ald, hlw> a = Maps.newHashMap();
      private Map<ald, auy> b = Map.of();

      void a(ava $$0) {
         this.b = hkm.a.a($$0);
      }

      void a(ald $$0, hkn $$1) {
         hlw $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hlv.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hlw($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         avd $$4 = avd.fromMap(this.b);

         for (final hkm $$5 : $$1.a()) {
            final ald $$6 = $$5.a();
            hlx<hkm> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hlv.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hlx<hkm>() {
                     @Override
                     public int e() {
                        hlw $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public hkm a(azs $$0) {
                        hlw $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return hlv.b;
                        } else {
                           hkm $$2 = $$1.a($$0);
                           return new hkm($$2.a(), new bsx($$2.c(), $$5.c()), new bsx($$2.d(), $$5.d()), $$5.e(), hkm.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hls $$0) {
                        hlw $$1 = a.this.a.get($$6);
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

      public void a(Map<ald, hlw> $$0, Map<ald, auy> $$1, hls $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<ald, hlw> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
