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

public class hdf extends avg<hdf.a> {
   public static final ali a = ali.b("empty");
   public static final hbx b = new hbx(a, bre.a(1.0F), bre.a(1.0F), 1, hbx.a.a, false, false, 16);
   public static final ali c = ali.b("intentionally_empty");
   public static final hdg d = new hdg(c, null);
   public static final hbx e = new hbx(c, bre.a(1.0F), bre.a(1.0F), 1, hbx.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(xi.class, new xi.b(ke.b)).registerTypeAdapter(hby.class, new hbz()).create();
   private static final TypeToken<Map<String, hby>> i = new TypeToken<Map<String, hby>>() {
   };
   private final Map<ali, hdg> j = Maps.newHashMap();
   private final hdc k;
   private final Map<ali, auz> l = new HashMap<>();

   public hdf(fjm $$0) {
      this.k = new hdc(this, $$0, ave.fromMap(this.l));
   }

   protected hdf.a a(avb $$0, bon $$1) {
      hdf.a $$2 = new hdf.a();

      try (bos $$3 = $$1.d("list")) {
         $$2.a($$0);
      }

      for (String $$4 : $$0.a()) {
         try (bos $$5 = $$1.d($$4)) {
            for (auz $$7 : $$0.a(ali.a($$4, "sounds.json"))) {
               $$1.a($$7.b());

               try (Reader $$8 = $$7.e()) {
                  $$1.a("parse");
                  Map<String, hby> $$9 = aza.a(h, $$8, i);
                  $$1.b("register");

                  for (Entry<String, hby> $$10 : $$9.entrySet()) {
                     $$2.a(ali.a($$4, $$10.getKey()), $$10.getValue());
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

   protected void a(hdf.a $$0, avb $$1, bon $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ab.aV) {
         for (ali $$3 : this.j.keySet()) {
            hdg $$4 = this.j.get($$3);
            if (!xl.b($$4.a()) && ly.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (ali $$5 : this.j.keySet()) {
            if (!ly.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.h();
   }

   public fbv b() {
      return this.k.i();
   }

   static boolean a(hbx $$0, ali $$1, ave $$2) {
      ali $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public hdg a(ali $$0) {
      return this.j.get($$0);
   }

   public Collection<ali> d() {
      return this.j.keySet();
   }

   public void a(hcb $$0) {
      this.k.a($$0);
   }

   public void a(hca $$0) {
      this.k.c($$0);
   }

   public void a(hca $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(fir $$0) {
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

   public void a(awm $$0, float $$1) {
      if ($$0 == awm.a && $$1 <= 0.0F) {
         this.f();
      }

      this.k.a($$0, $$1);
   }

   public void b(hca $$0) {
      this.k.a($$0);
   }

   public boolean c(hca $$0) {
      return this.k.b($$0);
   }

   public void a(hde $$0) {
      this.k.a($$0);
   }

   public void b(hde $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable ali $$0, @Nullable awm $$1) {
      this.k.a($$0, $$1);
   }

   public String j() {
      return this.k.g();
   }

   public void k() {
      this.k.a();
   }

   protected static class a {
      final Map<ali, hdg> a = Maps.newHashMap();
      private Map<ali, auz> b = Map.of();

      void a(avb $$0) {
         this.b = hbx.a.a($$0);
      }

      void a(ali $$0, hby $$1) {
         hdg $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               hdf.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new hdg($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         ave $$4 = ave.fromMap(this.b);

         for (final hbx $$5 : $$1.a()) {
            final ali $$6 = $$5.a();
            hdh<hbx> $$8;
            switch ($$5.f()) {
               case a:
                  if (!hdf.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new hdh<hbx>() {
                     @Override
                     public int e() {
                        hdg $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public hbx a(azs $$0) {
                        hdg $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return hdf.b;
                        } else {
                           hbx $$2 = $$1.a($$0);
                           return new hbx($$2.a(), new brk($$2.c(), $$5.c()), new brk($$2.d(), $$5.d()), $$5.e(), hbx.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(hdc $$0) {
                        hdg $$1 = a.this.a.get($$6);
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

      public void a(Map<ali, hdg> $$0, Map<ali, auz> $$1, hdc $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<ali, hdg> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
