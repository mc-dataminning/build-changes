package net.minecraft.server;

import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.net.Proxy;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyPair;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.obfuscate.DontObfuscate;
import org.slf4j.Logger;

public abstract class MinecraftServer extends bko<ajs> implements ajn, dt, AutoCloseable {
   private static final Logger k = LogUtils.getLogger();
   public static final String b = "vanilla";
   private static final float l = 0.8F;
   private static final int m = 100;
   private static final long n = 20L * axh.a / 20L;
   private static final int o = 20;
   private static final long p = 10L * axh.a;
   private static final int q = 100;
   private static final long r = 5L * axh.a;
   private static final long s = 10L * axh.b;
   private static final int t = 12;
   private static final int u = 5;
   private static final int v = 6000;
   private static final int w = 100;
   private static final int x = 3;
   public static final int c = 29999984;
   public static final cvr d = new cvr("Demo World", cvk.a, false, blr.c, false, new cvj(), cwh.c);
   public static final GameProfile e = new GameProfile(ac.d, "Anonymous Player");
   protected final eil.c f;
   protected final eio g;
   private final List<Runnable> y = Lists.newArrayList();
   private bjw z = bjv.a;
   private bil A = this.z.f();
   private Consumer<bik> B = $$0x -> this.aT();
   private Consumer<Path> C = $$0x -> {
   };
   private boolean D;
   @Nullable
   private MinecraftServer.c E;
   private boolean F;
   private final apt G;
   private final apf H;
   @Nullable
   private ahy I;
   @Nullable
   private ahy.a J;
   private final awo K = awo.a();
   private final DataFixer L;
   private String M;
   private int N = -1;
   private final iq<ajh> O;
   private final Map<aix<cvn>, aov> P = Maps.newLinkedHashMap();
   private asn Q;
   private volatile boolean R = true;
   private boolean S;
   private int T;
   private int U = 6000;
   protected final Proxy h;
   private boolean V;
   private boolean W;
   private boolean X;
   private boolean Y;
   @Nullable
   private String Z;
   private int aa;
   private final long[] ab = new long[100];
   private long ac = 0L;
   @Nullable
   private KeyPair ad;
   @Nullable
   private GameProfile ae;
   private boolean af;
   private volatile boolean ag;
   private long ah;
   protected final ajr i;
   private long ai;
   private final Thread aj;
   private long ak = ac.c();
   private long al;
   private boolean am;
   private final arl an;
   private final ajp ao = new ajp(this);
   @Nullable
   private eic ap;
   private final ajy aq = new ajy();
   private final ajm ar;
   private boolean as;
   private float at;
   private final Executor au;
   @Nullable
   private String av;
   private MinecraftServer.a aw;
   private final eff ax;
   private final ajq ay;
   protected final eir j;
   private volatile boolean az;

   public static <S extends MinecraftServer> S a(Function<Thread, S> $$0) {
      AtomicReference<S> $$1 = new AtomicReference<>();
      Thread $$2 = new Thread(() -> $$1.get().w(), "Server thread");
      $$2.setUncaughtExceptionHandler(($$0x, $$1x) -> k.error("Uncaught exception in server thread", $$1x));
      if (Runtime.getRuntime().availableProcessors() > 4) {
         $$2.setPriority(8);
      }

      S $$3 = (S)$$0.apply($$2);
      $$1.set($$3);
      $$2.start();
      return $$3;
   }

   public MinecraftServer(Thread $$0, eil.c $$1, arl $$2, aju $$3, Proxy $$4, DataFixer $$5, ajr $$6, apf $$7) {
      super("Server");
      this.O = $$3.c();
      this.j = $$3.d();
      if (!this.O.a().d(kg.aN).c(dop.b)) {
         throw new IllegalStateException("Missing Overworld dimension data");
      } else {
         this.h = $$4;
         this.an = $$2;
         this.aw = new MinecraftServer.a($$3.a(), $$3.b());
         this.i = $$6;
         if ($$6.f() != null) {
            $$6.f().a(this);
         }

         this.G = new apt(this);
         this.ay = new ajq(this);
         this.H = $$7;
         this.f = $$1;
         this.g = $$1.e();
         this.L = $$5;
         this.ar = new ajm(this, this.aw.b.a());
         ik<cyo> $$8 = this.O.a().d(kg.f).p().a(this.j.K());
         this.ax = new eff($$3.a(), $$1, $$5, $$8);
         this.aj = $$0;
         this.au = ac.f();
      }
   }

   private void a(eif $$0) {
      $$0.a(this.aH().b(), "scoreboard");
   }

   protected abstract boolean e() throws IOException;

   protected void u_() {
      if (!bir.e.c()) {
      }

      boolean $$0 = false;
      biu $$1 = bir.e.e();
      this.j.a(this.getServerModName(), this.M().a());
      ape $$2 = this.H.create(this.j.o().c(cvj.Z));
      this.a($$2);
      this.r();
      this.b($$2);
      if ($$1 != null) {
         $$1.finish();
      }

      if ($$0) {
         try {
            bir.e.b();
         } catch (Throwable var5) {
            k.warn("Failed to stop JFR profiling", var5);
         }
      }
   }

   protected void r() {
   }

   protected void a(ape $$0) {
      eiq $$1 = this.j.I();
      boolean $$2 = this.j.A();
      iv<dop> $$3 = this.O.a().d(kg.aN);
      drm $$4 = this.j.y();
      long $$5 = $$4.b();
      long $$6 = cwo.a($$5);
      List<cva> $$7 = ImmutableList.of(new dra(), new dqz(), new cgq(), new bzf(), new chb($$1));
      dop $$8 = $$3.a(dop.b);
      aov $$9 = new aov(this, this.au, this.f, $$1, cvn.h, $$8, $$0, $$2, $$6, $$7, true, null);
      this.P.put(cvn.h, $$9);
      eif $$10 = $$9.u();
      this.a($$10);
      this.ap = new eic($$10);
      dmw $$11 = $$9.D_();
      if (!$$1.n()) {
         try {
            a($$9, $$1, $$4.d(), $$2);
            $$1.c(true);
            if ($$2) {
               this.a(this.j);
            }
         } catch (Throwable var23) {
            o $$13 = o.a(var23, "Exception initializing level");

            try {
               $$9.a($$13);
            } catch (Throwable var22) {
            }

            throw new y($$13);
         }

         $$1.c(true);
      }

      this.ae().a($$9);
      if (this.j.E() != null) {
         this.aL().a(this.j.E());
      }

      bmb $$14 = $$9.J();

      for (Entry<aix<dop>, dop> $$15 : $$3.g()) {
         aix<dop> $$16 = $$15.getKey();
         if ($$16 != dop.b) {
            aix<cvn> $$17 = aix.a(kg.aM, $$16.a());
            eie $$18 = new eie(this.j, $$1);
            aov $$19 = new aov(this, this.au, this.f, $$18, $$17, $$15.getValue(), $$0, $$2, $$6, ImmutableList.of(), false, $$14);
            $$11.a(new dmu.a($$19.D_()));
            this.P.put($$17, $$19);
         }
      }

      $$11.a($$1.p());
   }

   private static void a(aov $$0, eiq $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         $$1.a(hz.c.b(80), 0.0F);
      } else {
         aot $$4 = $$0.l();
         cuu $$5 = new cuu($$4.i().b().a());
         int $$6 = $$4.g().a($$0);
         if ($$6 < $$0.J_()) {
            hz $$7 = $$5.l();
            $$6 = $$0.a(dqo.a.b, $$7.u() + 8, $$7.w() + 8);
         }

         $$1.a($$5.l().b(8, $$6, 8), 0.0F);
         int $$8 = 0;
         int $$9 = 0;
         int $$10 = 0;
         int $$11 = -1;

         for (int $$12 = 0; $$12 < awh.h(11); $$12++) {
            if ($$8 >= -5 && $$8 <= 5 && $$9 >= -5 && $$9 <= 5) {
               hz $$13 = aoq.a($$0, new cuu($$5.e + $$8, $$5.f + $$9));
               if ($$13 != null) {
                  $$1.a($$13, 0.0F);
                  break;
               }
            }

            if ($$8 == $$9 || $$8 < 0 && $$8 == -$$9 || $$8 > 0 && $$8 == 1 - $$9) {
               int $$14 = $$10;
               $$10 = -$$11;
               $$11 = $$14;
            }

            $$8 += $$10;
            $$9 += $$11;
         }

         if ($$2) {
            $$0.I_().c(kg.aw).flatMap($$0x -> $$0x.b(qn.m)).ifPresent($$3x -> ((dtf)$$3x.a()).a($$0, $$4.g(), $$0.z, $$1.a()));
         }
      }
   }

   private void a(eir $$0) {
      $$0.a(blr.a);
      $$0.d(true);
      eiq $$1 = $$0.I();
      $$1.b(false);
      $$1.a(false);
      $$1.a(1000000000);
      $$1.b(6000L);
      $$1.a(cvk.d);
   }

   private void b(ape $$0) {
      aov $$1 = this.F();
      k.info("Preparing start region for dimension {}", $$1.ae().a());
      hz $$2 = $$1.T();
      $$0.a(new cuu($$2));
      aot $$3 = $$1.l();
      this.ak = ac.c();
      $$1.a($$2, $$1.U());
      int $$4 = this.aK().c(cvj.Z);
      int $$5 = $$4 > 0 ? awh.h(ape.a($$4)) : 0;

      while ($$3.b() < $$5) {
         this.ak = ac.c() + s;
         this.w_();
      }

      this.ak = ac.c() + s;
      this.w_();

      for (aov $$6 : this.P.values()) {
         cvi $$7 = $$6.u().b(cvi.a(), "chunks");
         if ($$7 != null) {
            LongIterator $$8 = $$7.b().iterator();

            while ($$8.hasNext()) {
               long $$9 = $$8.nextLong();
               cuu $$10 = new cuu($$9);
               $$6.l().a($$10, true);
            }
         }
      }

      this.ak = ac.c() + s;
      this.w_();
      $$0.b();
      this.bz();
   }

   public cvk v_() {
      return this.j.k();
   }

   public boolean h() {
      return this.j.l();
   }

   public abstract int i();

   public abstract int j();

   public abstract boolean k();

   public boolean a(boolean $$0, boolean $$1, boolean $$2) {
      boolean $$3 = false;

      for (aov $$4 : this.H()) {
         if (!$$0) {
            k.info("Saving chunks for level '{}'/{}", $$4, $$4.ae().a());
         }

         $$4.a(null, $$1, $$4.e && !$$2);
         $$3 = true;
      }

      aov $$5 = this.F();
      eiq $$6 = this.j.I();
      $$6.a($$5.D_().t());
      this.j.a(this.aL().c());
      this.f.a(this.aZ(), this.j, this.ae().r());
      if ($$1) {
         for (aov $$7 : this.H()) {
            k.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", $$7.l().a.n());
         }

         k.info("ThreadedAnvilChunkStorage: All dimensions are saved");
      }

      return $$3;
   }

   public boolean b(boolean $$0, boolean $$1, boolean $$2) {
      boolean var4;
      try {
         this.az = true;
         this.ae().h();
         var4 = this.a($$0, $$1, $$2);
      } finally {
         this.az = false;
      }

      return var4;
   }

   @Override
   public void close() {
      this.t();
   }

   public void t() {
      if (this.z.e()) {
         this.aV();
      }

      k.info("Stopping server");
      this.af().b();
      this.az = true;
      if (this.Q != null) {
         k.info("Saving players");
         this.Q.h();
         this.Q.s();
      }

      k.info("Saving worlds");

      for (aov $$0 : this.H()) {
         if ($$0 != null) {
            $$0.e = false;
         }
      }

      while (this.P.values().stream().anyMatch($$0x -> $$0x.l().a.f())) {
         this.ak = ac.c() + axh.b;

         for (aov $$1 : this.H()) {
            $$1.l().o();
            $$1.l().a(() -> true, false);
         }

         this.w_();
      }

      this.a(false, true, false);

      for (aov $$2 : this.H()) {
         if ($$2 != null) {
            try {
               $$2.close();
            } catch (IOException var5) {
               k.error("Exception closing the level", var5);
            }
         }
      }

      this.az = false;
      this.aw.close();

      try {
         this.f.close();
      } catch (IOException var4) {
         k.error("Failed to unlock level {}", this.f.d(), var4);
      }
   }

   public String u() {
      return this.M;
   }

   public void a_(String $$0) {
      this.M = $$0;
   }

   public boolean v() {
      return this.R;
   }

   public void a(boolean $$0) {
      this.R = false;
      if ($$0) {
         try {
            this.aj.join();
         } catch (InterruptedException var3) {
            k.error("Error while shutting down", var3);
         }
      }
   }

   protected void w() {
      try {
         if (!this.e()) {
            throw new IllegalStateException("Failed to initialize server");
         }

         this.ak = ac.c();
         this.J = this.bn().orElse(null);
         this.I = this.bp();

         while (this.R) {
            long $$0;
            if (!this.A() && this.ay.a() && this.ay.d()) {
               $$0 = 0L;
               this.ak = ac.c();
               this.ah = this.ak;
            } else {
               $$0 = this.ay.h();
               long $$2 = ac.c() - this.ak;
               if ($$2 > n + 20L * $$0 && this.ak - this.ah >= p + 100L * $$0) {
                  long $$3 = $$2 / $$0;
                  k.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", $$2 / axh.b, $$3);
                  this.ak += $$3 * $$0;
                  this.ah = this.ak;
               }
            }

            boolean $$4 = $$0 == 0L;
            if (this.F) {
               this.F = false;
               this.E = new MinecraftServer.c(ac.c(), this.T);
            }

            this.ak += $$0;
            this.bA();
            this.A.a("tick");
            this.a($$4 ? () -> false : this::bl);
            this.A.b("nextTickWait");
            this.am = true;
            this.al = Math.max(ac.c() + $$0, this.ak);
            this.w_();
            if ($$4) {
               this.ay.e();
            }

            this.A.c();
            this.bB();
            this.ag = true;
            bir.e.a(this.at);
         }
      } catch (Throwable var46) {
         k.error("Encountered an unexpected exception", var46);
         o $$7 = a(var46);
         this.b($$7.g());
         File $$8 = new File(new File(this.z(), "crash-reports"), "crash-" + ac.e() + "-server.txt");
         if ($$7.a($$8)) {
            k.error("This crash report has been saved to: {}", $$8.getAbsolutePath());
         } else {
            k.error("We were unable to save this crash report to disk.");
         }

         this.a($$7);
      } finally {
         try {
            this.S = true;
            this.t();
         } catch (Throwable var44) {
            k.error("Exception stopping the server", var44);
         } finally {
            if (this.i.f() != null) {
               this.i.f().a();
            }

            this.g();
         }
      }
   }

   private static o a(Throwable $$0) {
      y $$1 = null;

      for (Throwable $$2 = $$0; $$2 != null; $$2 = $$2.getCause()) {
         if ($$2 instanceof y $$3) {
            $$1 = $$3;
         }
      }

      o $$4;
      if ($$1 != null) {
         $$4 = $$1.a();
         if ($$1 != $$0) {
            $$4.a("Wrapped in").a("Wrapping exception", $$0);
         }
      } else {
         $$4 = new o("Exception in server tick loop", $$0);
      }

      return $$4;
   }

   private boolean bl() {
      return this.bx() || ac.c() < (this.am ? this.al : this.ak);
   }

   protected void w_() {
      this.bv();
      this.c(() -> !this.bl());
   }

   protected ajs a(Runnable $$0) {
      return new ajs(this.T, $$0);
   }

   protected boolean a(ajs $$0) {
      return $$0.a() + 3 < this.T || this.bl();
   }

   @Override
   public boolean x() {
      boolean $$0 = this.bm();
      this.am = $$0;
      return $$0;
   }

   private boolean bm() {
      if (super.x()) {
         return true;
      } else {
         if (this.ay.a() || this.bl()) {
            for (aov $$0 : this.H()) {
               if ($$0.l().d()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   protected void b(ajs $$0) {
      this.aR().d("runTask");
      super.d($$0);
   }

   private Optional<ahy.a> bn() {
      Optional<Path> $$0 = Optional.of(this.c("server-icon.png").toPath())
         .filter($$0x -> Files.isRegularFile($$0x))
         .or(() -> this.f.h().filter($$0x -> Files.isRegularFile($$0x)));
      return $$0.flatMap($$0x -> {
         try {
            BufferedImage $$1 = ImageIO.read($$0x.toFile());
            Preconditions.checkState($$1.getWidth() == 64, "Must be 64 pixels wide");
            Preconditions.checkState($$1.getHeight() == 64, "Must be 64 pixels high");
            ByteArrayOutputStream $$2 = new ByteArrayOutputStream();
            ImageIO.write($$1, "PNG", $$2);
            return Optional.of(new ahy.a($$2.toByteArray()));
         } catch (Exception var3) {
            k.error("Couldn't load server icon", var3);
            return Optional.empty();
         }
      });
   }

   public Optional<Path> y() {
      return this.f.h();
   }

   public File z() {
      return new File(".");
   }

   public void a(o $$0) {
   }

   public void g() {
   }

   public boolean A() {
      return false;
   }

   public void a(BooleanSupplier $$0) {
      long $$1 = ac.c();
      this.T++;
      this.ay.m();
      this.b($$0);
      if ($$1 - this.ai >= r) {
         this.ai = $$1;
         this.I = this.bp();
      }

      this.U--;
      if (this.U <= 0) {
         this.U = this.bo();
         k.debug("Autosave started");
         this.A.a("save");
         this.b(true, false, false);
         this.A.c();
         k.debug("Autosave finished");
      }

      this.A.a("tallying");
      long $$2 = ac.c() - $$1;
      int $$3 = this.T % 100;
      this.ac = this.ac - this.ab[$$3];
      this.ac += $$2;
      this.ab[$$3] = $$2;
      this.at = this.at * 0.8F + (float)$$2 / (float)axh.b * 0.19999999F;
      long $$4 = ac.c();
      this.a($$4 - $$1);
      this.A.c();
   }

   private int bo() {
      float $$1;
      if (this.ay.a()) {
         long $$0 = this.aP() + 1L;
         $$1 = (float)axh.a / (float)$$0;
      } else {
         $$1 = this.ay.f();
      }

      int $$3 = 300;
      return Math.max(100, (int)($$1 * 300.0F));
   }

   public void B() {
      int $$0 = this.bo();
      if ($$0 < this.U) {
         this.U = $$0;
      }
   }

   protected void a(long $$0) {
   }

   private ahy bp() {
      ahy.b $$0 = this.by();
      return new ahy(vq.a(this.Z), Optional.of($$0), Optional.of(ahy.c.a()), Optional.ofNullable(this.J), this.ay());
   }

   private ahy.b by() {
      List<aow> $$0 = this.Q.t();
      int $$1 = this.K();
      if (this.al()) {
         return new ahy.b($$1, $$0.size(), List.of());
      } else {
         int $$2 = Math.min($$0.size(), 12);
         ObjectArrayList<GameProfile> $$3 = new ObjectArrayList($$2);
         int $$4 = awh.a(this.K, 0, $$0.size() - $$2);

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            aow $$6 = $$0.get($$4 + $$5);
            $$3.add($$6.Z() ? $$6.fS() : e);
         }

         ac.c($$3, this.K);
         return new ahy.b($$1, $$0.size(), $$3);
      }
   }

   public void b(BooleanSupplier $$0) {
      this.ae().t().forEach($$0x -> $$0x.d.g());
      this.A.a("commandFunctions");
      this.aC().b();
      this.A.b("levels");

      for (aov $$1 : this.H()) {
         this.A.a(() -> $$1 + " " + $$1.ae().a());
         if (this.T % 20 == 0) {
            this.A.a("timeSync");
            this.b($$1);
            this.A.c();
         }

         this.A.a("tick");

         try {
            $$1.a($$0);
         } catch (Throwable var6) {
            o $$3 = o.a(var6, "Exception ticking world");
            $$1.a($$3);
            throw new y($$3);
         }

         this.A.c();
         this.A.c();
      }

      this.A.b("connection");
      this.af().c();
      this.A.b("players");
      this.Q.d();
      if (aa.aU && this.ay.i()) {
         ry.a.b();
      }

      this.A.b("server gui refresh");

      for (int $$4 = 0; $$4 < this.y.size(); $$4++) {
         this.y.get($$4).run();
      }

      this.A.b("send chunks");

      for (aow $$5 : this.Q.t()) {
         $$5.d.f.a($$5);
         $$5.d.h();
      }

      this.A.c();
   }

   private void b(aov $$0) {
      this.Q.a(new adv($$0.X(), $$0.Y(), $$0.Z().b(cvj.l)), $$0.ae());
   }

   public void C() {
      this.A.a("timeSync");

      for (aov $$0 : this.H()) {
         this.b($$0);
      }

      this.A.c();
   }

   public boolean D() {
      return true;
   }

   public void b(Runnable $$0) {
      this.y.add($$0);
   }

   protected void b(String $$0) {
      this.av = $$0;
   }

   public boolean E() {
      return !this.aj.isAlive();
   }

   public File c(String $$0) {
      return new File(this.z(), $$0);
   }

   public final aov F() {
      return this.P.get(cvn.h);
   }

   @Nullable
   public aov a(aix<cvn> $$0) {
      return this.P.get($$0);
   }

   public Set<aix<cvn>> G() {
      return this.P.keySet();
   }

   public Iterable<aov> H() {
      return this.P.values();
   }

   @Override
   public String I() {
      return aa.b().c();
   }

   @Override
   public int J() {
      return this.Q.m();
   }

   @Override
   public int K() {
      return this.Q.n();
   }

   public String[] L() {
      return this.Q.e();
   }

   @DontObfuscate
   public String getServerModName() {
      return "vanilla";
   }

   public ab b(ab $$0) {
      $$0.a("Server Running", () -> Boolean.toString(this.R));
      if (this.Q != null) {
         $$0.a("Player Count", () -> this.Q.m() + " / " + this.Q.n() + "; " + this.Q.t());
      }

      $$0.a("Data Packs", () -> this.an.f().stream().map($$0x -> $$0x.f() + ($$0x.c().a() ? "" : " (incompatible)")).collect(Collectors.joining(", ")));
      $$0.a("Enabled Feature Flags", () -> cju.e.b(this.j.K()).stream().map(aiy::toString).collect(Collectors.joining(", ")));
      $$0.a("World Generation", () -> this.j.B().toString());
      if (this.av != null) {
         $$0.a("Server Id", () -> this.av);
      }

      return this.a($$0);
   }

   public abstract ab a(ab var1);

   public awg M() {
      return awg.a("vanilla", this::getServerModName, "Server", MinecraftServer.class);
   }

   @Override
   public void a(vq $$0) {
      k.info($$0.getString());
   }

   public KeyPair N() {
      return this.ad;
   }

   public int O() {
      return this.N;
   }

   public void a(int $$0) {
      this.N = $$0;
   }

   @Nullable
   public GameProfile P() {
      return this.ae;
   }

   public void b(@Nullable GameProfile $$0) {
      this.ae = $$0;
   }

   public boolean Q() {
      return this.ae != null;
   }

   protected void R() {
      k.info("Generating keypair");

      try {
         this.ad = avf.b();
      } catch (avg var2) {
         throw new IllegalStateException("Failed to generate key pair", var2);
      }
   }

   public void a(blr $$0, boolean $$1) {
      if ($$1 || !this.j.r()) {
         this.j.a(this.j.l() ? blr.d : $$0);
         this.bz();
         this.ae().t().forEach(this::c);
      }
   }

   public int b(int $$0) {
      return $$0;
   }

   private void bz() {
      for (aov $$0 : this.H()) {
         $$0.b(this.S(), this.Y());
      }
   }

   public void b(boolean $$0) {
      this.j.d($$0);
      this.ae().t().forEach(this::c);
   }

   private void c(aow $$0) {
      eih $$1 = $$0.dM().B_();
      $$0.d.b(new aat($$1.q(), $$1.r()));
   }

   public boolean S() {
      return this.j.q() != blr.a;
   }

   public boolean T() {
      return this.af;
   }

   public void c(boolean $$0) {
      this.af = $$0;
   }

   public Optional<MinecraftServer.b> U() {
      return Optional.empty();
   }

   public boolean V() {
      return this.U().filter(MinecraftServer.b::d).isPresent();
   }

   public abstract boolean l();

   public abstract int m();

   public boolean W() {
      return this.V;
   }

   public void d(boolean $$0) {
      this.V = $$0;
   }

   public boolean X() {
      return this.W;
   }

   public void e(boolean $$0) {
      this.W = $$0;
   }

   public boolean Y() {
      return true;
   }

   public boolean Z() {
      return true;
   }

   public abstract boolean n();

   public boolean aa() {
      return this.X;
   }

   public void f(boolean $$0) {
      this.X = $$0;
   }

   public boolean ab() {
      return this.Y;
   }

   public void g(boolean $$0) {
      this.Y = $$0;
   }

   public abstract boolean o();

   @Override
   public String ac() {
      return this.Z;
   }

   public void d(String $$0) {
      this.Z = $$0;
   }

   public boolean ad() {
      return this.S;
   }

   public asn ae() {
      return this.Q;
   }

   public void a(asn $$0) {
      this.Q = $$0;
   }

   public abstract boolean p();

   public void a(cvk $$0) {
      this.j.a($$0);
   }

   public apt af() {
      return this.G;
   }

   public boolean ag() {
      return this.ag;
   }

   public boolean ah() {
      return false;
   }

   public boolean a(@Nullable cvk $$0, boolean $$1, int $$2) {
      return false;
   }

   public int ai() {
      return this.T;
   }

   public int aj() {
      return 16;
   }

   public boolean a(aov $$0, hz $$1, chh $$2) {
      return false;
   }

   public boolean ak() {
      return true;
   }

   public boolean al() {
      return false;
   }

   public Proxy am() {
      return this.h;
   }

   public int an() {
      return this.aa;
   }

   public void c(int $$0) {
      this.aa = $$0;
   }

   public MinecraftSessionService ao() {
      return this.i.c();
   }

   @Nullable
   public awu ap() {
      return this.i.a();
   }

   public GameProfileRepository aq() {
      return this.i.e();
   }

   @Nullable
   public asj ar() {
      return this.i.f();
   }

   @Nullable
   public ahy as() {
      return this.I;
   }

   public void at() {
      this.ai = 0L;
   }

   public int au() {
      return 29999984;
   }

   @Override
   public boolean av() {
      return super.av() && !this.ad();
   }

   @Override
   public void c(Runnable $$0) {
      if (this.ad()) {
         throw new RejectedExecutionException("Server already shutting down");
      } else {
         super.c($$0);
      }
   }

   @Override
   public Thread aw() {
      return this.aj;
   }

   public int ax() {
      return 256;
   }

   public boolean ay() {
      return false;
   }

   public long az() {
      return this.ak;
   }

   public DataFixer aA() {
      return this.L;
   }

   public int a(@Nullable aov $$0) {
      return $$0 != null ? $$0.Z().c(cvj.s) : 10;
   }

   public ajk aB() {
      return this.aw.b.e();
   }

   public ajm aC() {
      return this.ar;
   }

   public CompletableFuture<Void> a(Collection<String> $$0) {
      iw.b $$1 = this.O.b(ajh.d);
      CompletableFuture<Void> $$2 = CompletableFuture.<ImmutableList>supplyAsync(
            () -> $$0.stream().map(this.an::c).filter(Objects::nonNull).map(ari::e).collect(ImmutableList.toImmutableList()), this
         )
         .thenCompose($$1x -> {
            arq $$2x = new art(aqp.b, $$1x);
            return aji.a($$2x, $$1, this.j.K(), this.l() ? dv.a.b : dv.a.c, this.j(), this.au, this).whenComplete(($$1xx, $$2xx) -> {
               if ($$2xx != null) {
                  $$2x.close();
               }
            }).thenApply($$1xx -> new MinecraftServer.a($$2x, $$1xx));
         })
         .thenAcceptAsync($$1x -> {
            this.aw.close();
            this.aw = $$1x;
            this.an.a($$0);
            cwh $$2x = new cwh(a(this.an), this.j.K());
            this.j.a($$2x);
            this.aw.b.a(this.aZ());
            this.ae().h();
            this.ae().u();
            this.ar.a(this.aw.b.a());
            this.ax.a(this.aw.a);
         }, this);
      if (this.br()) {
         this.c($$2::isDone);
      }

      return $$2;
   }

   public static cwh a(arl $$0, cvb $$1, boolean $$2, cjs $$3) {
      $$0.a();
      if ($$2) {
         $$0.a(Collections.singleton("vanilla"));
         return cwh.c;
      } else {
         Set<String> $$4 = Sets.newLinkedHashSet();

         for (String $$5 : $$1.a()) {
            if ($$0.d($$5)) {
               $$4.add($$5);
            } else {
               k.warn("Missing data pack {}", $$5);
            }
         }

         for (ari $$6 : $$0.c()) {
            String $$7 = $$6.f();
            if (!$$1.b().contains($$7)) {
               cjs $$8 = $$6.d();
               boolean $$9 = $$4.contains($$7);
               if (!$$9 && $$6.j().a()) {
                  if ($$8.a($$3)) {
                     k.info("Found new data pack {}, loading it automatically", $$7);
                     $$4.add($$7);
                  } else {
                     k.info("Found new data pack {}, but can't load it due to missing features {}", $$7, cju.a($$3, $$8));
                  }
               }

               if ($$9 && !$$8.a($$3)) {
                  k.warn("Pack {} requires features {} that are not enabled for this world, disabling pack.", $$7, cju.a($$3, $$8));
                  $$4.remove($$7);
               }
            }
         }

         if ($$4.isEmpty()) {
            k.info("No datapacks selected, forcing vanilla");
            $$4.add("vanilla");
         }

         $$0.a($$4);
         cvb $$10 = a($$0);
         cjs $$11 = $$0.e();
         return new cwh($$10, $$11);
      }
   }

   private static cvb a(arl $$0) {
      Collection<String> $$1 = $$0.d();
      List<String> $$2 = ImmutableList.copyOf($$1);
      List<String> $$3 = $$0.b().stream().filter($$1x -> !$$1.contains($$1x)).collect(ImmutableList.toImmutableList());
      return new cvb($$2, $$3);
   }

   public void a(du $$0) {
      if (this.aM()) {
         asn $$1 = $$0.l().ae();
         asv $$2 = $$1.i();

         for (aow $$4 : Lists.newArrayList($$1.t())) {
            if (!$$2.a($$4.fS())) {
               $$4.d.b(vq.c("multiplayer.disconnect.not_whitelisted"));
            }
         }
      }
   }

   public arl aD() {
      return this.an;
   }

   public dv aE() {
      return this.aw.b.d();
   }

   public du aF() {
      aov $$0 = this.F();
      return new du(this, $$0 == null ? ens.b : ens.a($$0.T()), enr.a, $$0, 4, "Server", vq.b("Server"), this, null);
   }

   @Override
   public boolean l_() {
      return true;
   }

   @Override
   public boolean x_() {
      return true;
   }

   @Override
   public abstract boolean W_();

   public cse aG() {
      return this.aw.b.c();
   }

   public ajp aH() {
      return this.ao;
   }

   public eic aI() {
      if (this.ap == null) {
         throw new NullPointerException("Called before server init");
      } else {
         return this.ap;
      }
   }

   public eiy aJ() {
      return this.aw.b.b();
   }

   public cvj aK() {
      return this.F().Z();
   }

   public ajy aL() {
      return this.aq;
   }

   public boolean aM() {
      return this.as;
   }

   public void h(boolean $$0) {
      this.as = $$0;
   }

   public float aN() {
      return this.at;
   }

   public ajq aO() {
      return this.ay;
   }

   public long aP() {
      return this.ac / (long)Math.min(100, Math.max(this.T, 1));
   }

   public long[] aQ() {
      return this.ab;
   }

   public int c(GameProfile $$0) {
      if (this.ae().f($$0)) {
         asp $$1 = this.ae().k().b($$0);
         if ($$1 != null) {
            return $$1.a();
         } else if (this.a($$0)) {
            return 4;
         } else if (this.Q()) {
            return this.ae().v() ? 4 : 0;
         } else {
            return this.i();
         }
      } else {
         return 0;
      }
   }

   public bil aR() {
      return this.A;
   }

   public abstract boolean a(GameProfile var1);

   public void a(Path $$0) throws IOException {
   }

   private void b(Path $$0) {
      Path $$1 = $$0.resolve("levels");

      try {
         for (Entry<aix<cvn>, aov> $$2 : this.P.entrySet()) {
            aiy $$3 = $$2.getKey().a();
            Path $$4 = $$1.resolve($$3.b()).resolve($$3.a());
            Files.createDirectories($$4);
            $$2.getValue().a($$4);
         }

         this.d($$0.resolve("gamerules.txt"));
         this.e($$0.resolve("classpath.txt"));
         this.c($$0.resolve("stats.txt"));
         this.f($$0.resolve("threads.txt"));
         this.a($$0.resolve("server.properties.txt"));
         this.g($$0.resolve("modules.txt"));
      } catch (IOException var7) {
         k.warn("Failed to save debug report", var7);
      }
   }

   private void c(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         $$1.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.bs()));
         $$1.write(String.format(Locale.ROOT, "average_tick_time: %f\n", this.aN()));
         $$1.write(String.format(Locale.ROOT, "tick_times: %s\n", Arrays.toString(this.ab)));
         $$1.write(String.format(Locale.ROOT, "queue: %s\n", ac.f()));
      }
   }

   private void d(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         final List<String> $$2 = Lists.newArrayList();
         final cvj $$3 = this.aK();
         cvj.a(new cvj.c() {
            @Override
            public <T extends cvj.g<T>> void a(cvj.e<T> $$0, cvj.f<T> $$1) {
               $$2.add(String.format(Locale.ROOT, "%s=%s\n", $$0.a(), $$3.a($$0)));
            }
         });

         for (String $$4 : $$2) {
            $$1.write($$4);
         }
      }
   }

   private void e(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         String $$2 = System.getProperty("java.class.path");
         String $$3 = System.getProperty("path.separator");

         for (String $$4 : Splitter.on($$3).split($$2)) {
            $$1.write($$4);
            $$1.write("\n");
         }
      }
   }

   private void f(Path $$0) throws IOException {
      ThreadMXBean $$1 = ManagementFactory.getThreadMXBean();
      ThreadInfo[] $$2 = $$1.dumpAllThreads(true, true);
      Arrays.sort($$2, Comparator.comparing(ThreadInfo::getThreadName));

      try (Writer $$3 = Files.newBufferedWriter($$0)) {
         for (ThreadInfo $$4 : $$2) {
            $$3.write($$4.toString());
            $$3.write(10);
         }
      }
   }

   private void g(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         List<awi.a> $$2;
         try {
            $$2 = Lists.newArrayList(awi.a());
         } catch (Throwable var7) {
            k.warn("Failed to list native modules", var7);
            return;
         }

         $$2.sort(Comparator.comparing($$0x -> $$0x.a));

         for (awi.a $$5 : $$2) {
            $$1.write($$5.toString());
            $$1.write(10);
         }
      }
   }

   private void bA() {
      if (this.D) {
         this.z = bju.a(new bjy(ac.b, this.l()), ac.b, ac.g(), new bka("server"), this.B, $$0 -> {
            this.h(() -> this.b($$0.resolve("server")));
            this.C.accept($$0);
         });
         this.D = false;
      }

      this.A = bio.a(this.z.f(), bio.a("Server"));
      this.z.c();
      this.A.a();
   }

   private void bB() {
      this.A.b();
      this.z.d();
   }

   public boolean aS() {
      return this.z.e();
   }

   public void a(Consumer<bik> $$0, Consumer<Path> $$1) {
      this.B = $$1x -> {
         this.aT();
         $$0.accept($$1x);
      };
      this.C = $$1;
      this.D = true;
   }

   public void aT() {
      this.z = bjv.a;
   }

   public void aU() {
      this.z.a();
   }

   public void aV() {
      this.z.b();
      this.A = this.z.f();
   }

   public Path a(eij $$0) {
      return this.f.a($$0);
   }

   public boolean aW() {
      return true;
   }

   public eff aX() {
      return this.ax;
   }

   public eir aY() {
      return this.j;
   }

   public iw.b aZ() {
      return this.O.a();
   }

   public iq<ajh> ba() {
      return this.O;
   }

   public apz a(aow $$0) {
      return apz.a;
   }

   public aox b(aow $$0) {
      return (aox)(this.T() ? new aom($$0) : new aox($$0));
   }

   @Nullable
   public cvk bb() {
      return null;
   }

   public asa bc() {
      return this.aw.a;
   }

   public boolean bd() {
      return this.az;
   }

   public boolean be() {
      return this.F || this.E != null;
   }

   public void bf() {
      this.F = true;
   }

   public bik bg() {
      if (this.E == null) {
         return big.a;
      } else {
         bik $$0 = this.E.a(ac.c(), this.T);
         this.E = null;
         return $$0;
      }
   }

   public int bh() {
      return 1000000;
   }

   public void a(vq $$0, vm.a $$1, @Nullable String $$2) {
      String $$3 = $$1.a($$0).getString();
      if ($$2 != null) {
         k.info("[{}] {}", $$2, $$3);
      } else {
         k.info("{}", $$3);
      }
   }

   public vl bi() {
      return vl.a;
   }

   public boolean bj() {
      return true;
   }

   public boolean bk() {
      return false;
   }

   static record a(arq a, aji b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.close();
      }
   }

   public static record b(UUID a, String b, String c, boolean d, @Nullable vq e) {
   }

   static class c {
      final long a;
      final int b;

      c(long $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      bik a(final long $$0, final int $$1) {
         return new bik() {
            @Override
            public List<bin> a(String $$0x) {
               return Collections.emptyList();
            }

            @Override
            public boolean a(Path $$0x) {
               return false;
            }

            @Override
            public long a() {
               return c.this.a;
            }

            @Override
            public int b() {
               return c.this.b;
            }

            @Override
            public long c() {
               return $$0;
            }

            @Override
            public int d() {
               return $$1;
            }

            @Override
            public String e() {
               return "";
            }
         };
      }
   }
}
