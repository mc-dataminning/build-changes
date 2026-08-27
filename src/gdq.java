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

public class gdq extends any<gdq.a> {
   public static final gcj a = new gcj("minecraft:empty", bfz.a(1.0F), bfz.a(1.0F), 1, gcj.a.a, false, false, 16);
   public static final aew b = new aew("minecraft", "intentionally_empty");
   public static final gdr c = new gdr(b, null);
   public static final gcj d = new gcj(b.toString(), bfz.a(1.0F), bfz.a(1.0F), 1, gcj.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(tl.class, new tl.a()).registerTypeAdapter(gck.class, new gcl()).create();
   private static final TypeToken<Map<String, gck>> h = new TypeToken<Map<String, gck>>() {
   };
   private final Map<aew, gdr> i = Maps.newHashMap();
   private final gdn j;
   private final Map<aew, anr> k = new HashMap<>();

   public gdq(eqz $$0) {
      this.j = new gdn(this, $$0, anw.fromMap(this.k));
   }

   protected gdq.a a(ant $$0, bdp $$1) {
      gdq.a $$2 = new gdq.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (anr $$5 : $$0.a(new aew($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gck> $$7 = arn.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gck> $$8 : $$7.entrySet()) {
                     $$2.a(new aew($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gdq.a $$0, ant $$1, bdp $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aT) {
         for (aew $$3 : this.i.keySet()) {
            gdr $$4 = this.i.get($$3);
            if (!tn.b($$4.a()) && jb.c.c($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (aew $$5 : this.i.keySet()) {
            if (!jb.c.c($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.g();
   }

   static boolean a(gcj $$0, aew $$1, anw $$2) {
      aew $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gdr a(aew $$0) {
      return this.i.get($$0);
   }

   public Collection<aew> b() {
      return this.i.keySet();
   }

   public void a(gcn $$0) {
      this.j.a($$0);
   }

   public void a(gcm $$0) {
      this.j.c($$0);
   }

   public void a(gcm $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(eqg $$0) {
      this.j.a($$0);
   }

   public void d() {
      this.j.d();
   }

   public void e() {
      this.j.c();
   }

   public void f() {
      this.j.b();
   }

   public void a(boolean $$0) {
      this.j.a($$0);
   }

   public void g() {
      this.j.e();
   }

   public void a(ape $$0, float $$1) {
      if ($$0 == ape.a && $$1 <= 0.0F) {
         this.e();
      }

      this.j.a($$0, $$1);
   }

   public void b(gcm $$0) {
      this.j.a($$0);
   }

   public boolean c(gcm $$0) {
      return this.j.b($$0);
   }

   public void a(gdp $$0) {
      this.j.a($$0);
   }

   public void b(gdp $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable aew $$0, @Nullable ape $$1) {
      this.j.a($$0, $$1);
   }

   public String h() {
      return this.j.f();
   }

   public void i() {
      this.j.a();
   }

   protected static class a {
      final Map<aew, gdr> a = Maps.newHashMap();
      private Map<aew, anr> b = Map.of();

      void a(ant $$0) {
         this.b = gcj.a.a($$0);
      }

      void a(aew $$0, gck $$1) {
         gdr $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gdq.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gdr($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         anw $$4 = anw.fromMap(this.b);

         for (final gcj $$5 : $$1.a()) {
            final aew $$6 = $$5.a();
            gds<gcj> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gdq.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gds<gcj>() {
                     @Override
                     public int e() {
                        gdr $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gcj a(asc $$0) {
                        gdr $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gdq.a;
                        } else {
                           gcj $$2 = $$1.a($$0);
                           return new gcj(
                              $$2.a().toString(), new bgf($$2.c(), $$5.c()), new bgf($$2.d(), $$5.d()), $$5.e(), gcj.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gdn $$0) {
                        gdr $$1 = a.this.a.get($$6);
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

      public void a(Map<aew, gdr> $$0, Map<aew, anr> $$1, gdn $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<aew, gdr> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
