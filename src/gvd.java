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

public class gvd extends auj<gvd.a> {
   public static final akr a = akr.b("empty");
   public static final gtv b = new gtv(a, bps.a(1.0F), bps.a(1.0F), 1, gtv.a.a, false, false, 16);
   public static final akr c = akr.b("intentionally_empty");
   public static final gve d = new gve(c, null);
   public static final gtv e = new gtv(c, bps.a(1.0F), bps.a(1.0F), 1, gtv.a.a, false, false, 16);
   static final Logger f = LogUtils.getLogger();
   private static final String g = "sounds.json";
   private static final Gson h = new GsonBuilder().registerTypeHierarchyAdapter(wz.class, new wz.b(ka.b)).registerTypeAdapter(gtw.class, new gtx()).create();
   private static final TypeToken<Map<String, gtw>> i = new TypeToken<Map<String, gtw>>() {
   };
   private final Map<akr, gve> j = Maps.newHashMap();
   private final gva k;
   private final Map<akr, auc> l = new HashMap<>();

   public gvd(fgq $$0) {
      this.k = new gva(this, $$0, auh.fromMap(this.l));
   }

   protected gvd.a a(aue $$0, bnf $$1) {
      gvd.a $$2 = new gvd.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (auc $$5 : $$0.a(akr.a($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gtw> $$7 = aye.a(h, $$6, i);
                  $$1.b("register");

                  for (Entry<String, gtw> $$8 : $$7.entrySet()) {
                     $$2.a(akr.a($$3, $$8.getKey()), $$8.getValue());
                  }

                  $$1.c();
               } catch (RuntimeException var15) {
                  f.warn("Invalid {} in resourcepack: '{}'", new Object[]{"sounds.json", $$5.b(), var15});
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

   protected void a(gvd.a $$0, aue $$1, bnf $$2) {
      $$0.a(this.j, this.l, this.k);
      if (ab.aU) {
         for (akr $$3 : this.j.keySet()) {
            gve $$4 = this.j.get($$3);
            if (!xc.b($$4.a()) && lt.b.d($$3)) {
               f.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (f.isDebugEnabled()) {
         for (akr $$5 : this.j.keySet()) {
            if (!lt.b.d($$5)) {
               f.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.k.a();
   }

   public List<String> a() {
      return this.k.h();
   }

   public ezf b() {
      return this.k.i();
   }

   static boolean a(gtv $$0, akr $$1, auh $$2) {
      akr $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         f.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gve a(akr $$0) {
      return this.j.get($$0);
   }

   public Collection<akr> d() {
      return this.j.keySet();
   }

   public void a(gtz $$0) {
      this.k.a($$0);
   }

   public void a(gty $$0) {
      this.k.c($$0);
   }

   public void a(gty $$0, int $$1) {
      this.k.a($$0, $$1);
   }

   public void a(ffw $$0) {
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

   public void a(avq $$0, float $$1) {
      if ($$0 == avq.a && $$1 <= 0.0F) {
         this.f();
      }

      this.k.a($$0, $$1);
   }

   public void b(gty $$0) {
      this.k.a($$0);
   }

   public boolean c(gty $$0) {
      return this.k.b($$0);
   }

   public void a(gvc $$0) {
      this.k.a($$0);
   }

   public void b(gvc $$0) {
      this.k.b($$0);
   }

   public void a(@Nullable akr $$0, @Nullable avq $$1) {
      this.k.a($$0, $$1);
   }

   public String j() {
      return this.k.g();
   }

   public void k() {
      this.k.a();
   }

   protected static class a {
      final Map<akr, gve> a = Maps.newHashMap();
      private Map<akr, auc> b = Map.of();

      void a(aue $$0) {
         this.b = gtv.a.a($$0);
      }

      void a(akr $$0, gtw $$1) {
         gve $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gvd.f.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gve($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         auh $$4 = auh.fromMap(this.b);

         for (final gtv $$5 : $$1.a()) {
            final akr $$6 = $$5.a();
            gvf<gtv> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gvd.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gvf<gtv>() {
                     @Override
                     public int e() {
                        gve $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gtv a(ayw $$0) {
                        gve $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gvd.b;
                        } else {
                           gtv $$2 = $$1.a($$0);
                           return new gtv($$2.a(), new bpy($$2.c(), $$5.c()), new bpy($$2.d(), $$5.d()), $$5.e(), gtv.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i());
                        }
                     }

                     @Override
                     public void a(gva $$0) {
                        gve $$1 = a.this.a.get($$6);
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

      public void a(Map<akr, gve> $$0, Map<akr, auc> $$1, gva $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<akr, gve> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
