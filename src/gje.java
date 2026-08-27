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

public class gje extends aqn<gje.a> {
   public static final ghx a = new ghx("minecraft:empty", bjc.a(1.0F), bjc.a(1.0F), 1, ghx.a.a, false, false, 16);
   public static final ahg b = new ahg("minecraft", "intentionally_empty");
   public static final gjf c = new gjf(b, null);
   public static final ghx d = new ghx(b.toString(), bjc.a(1.0F), bjc.a(1.0F), 1, ghx.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(vf.class, new vf.b()).registerTypeAdapter(ghy.class, new ghz()).create();
   private static final TypeToken<Map<String, ghy>> h = new TypeToken<Map<String, ghy>>() {
   };
   private final Map<ahg, gjf> i = Maps.newHashMap();
   private final gjb j;
   private final Map<ahg, aqg> k = new HashMap<>();

   public gje(evm $$0) {
      this.j = new gjb(this, $$0, aql.fromMap(this.k));
   }

   protected gje.a a(aqi $$0, bgs $$1) {
      gje.a $$2 = new gje.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (aqg $$5 : $$0.a(new ahg($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, ghy> $$7 = aue.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, ghy> $$8 : $$7.entrySet()) {
                     $$2.a(new ahg($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gje.a $$0, aqi $$1, bgs $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aW) {
         for (ahg $$3 : this.i.keySet()) {
            gjf $$4 = this.i.get($$3);
            if (!vi.b($$4.a()) && kd.b.c($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (ahg $$5 : this.i.keySet()) {
            if (!kd.b.c($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   public eny b() {
      return this.j.i();
   }

   static boolean a(ghx $$0, ahg $$1, aql $$2) {
      ahg $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gjf a(ahg $$0) {
      return this.i.get($$0);
   }

   public Collection<ahg> d() {
      return this.i.keySet();
   }

   public void a(gib $$0) {
      this.j.a($$0);
   }

   public void a(gia $$0) {
      this.j.c($$0);
   }

   public void a(gia $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(eut $$0) {
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

   public void a(art $$0, float $$1) {
      if ($$0 == art.a && $$1 <= 0.0F) {
         this.f();
      }

      this.j.a($$0, $$1);
   }

   public void b(gia $$0) {
      this.j.a($$0);
   }

   public boolean c(gia $$0) {
      return this.j.b($$0);
   }

   public void a(gjd $$0) {
      this.j.a($$0);
   }

   public void b(gjd $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable ahg $$0, @Nullable art $$1) {
      this.j.a($$0, $$1);
   }

   public String j() {
      return this.j.g();
   }

   public void k() {
      this.j.a();
   }

   protected static class a {
      final Map<ahg, gjf> a = Maps.newHashMap();
      private Map<ahg, aqg> b = Map.of();

      void a(aqi $$0) {
         this.b = ghx.a.a($$0);
      }

      void a(ahg $$0, ghy $$1) {
         gjf $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gje.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gjf($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         aql $$4 = aql.fromMap(this.b);

         for (final ghx $$5 : $$1.a()) {
            final ahg $$6 = $$5.a();
            gjg<ghx> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gje.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gjg<ghx>() {
                     @Override
                     public int e() {
                        gjf $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public ghx a(auv $$0) {
                        gjf $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gje.a;
                        } else {
                           ghx $$2 = $$1.a($$0);
                           return new ghx(
                              $$2.a().toString(), new bji($$2.c(), $$5.c()), new bji($$2.d(), $$5.d()), $$5.e(), ghx.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gjb $$0) {
                        gjf $$1 = a.this.a.get($$6);
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

      public void a(Map<ahg, gjf> $$0, Map<ahg, aqg> $$1, gjb $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<ahg, gjf> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
