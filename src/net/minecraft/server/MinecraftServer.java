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
import com.mojang.jtracy.DiscontinuousFrame;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.net.Proxy;
import java.nio.file.FileStore;
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
import java.util.concurrent.locks.LockSupport;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.obfuscate.DontObfuscate;
import org.slf4j.Logger;

public abstract class MinecraftServer extends brd<amg> implements alz, dyy, ev {
   private static final Logger l = LogUtils.getLogger();
   public static final String b = "vanilla";
   private static final float m = 0.8F;
   private static final int n = 100;
   private static final long o = 20L * bao.a / 20L;
   private static final int p = 20;
   private static final long q = 10L * bao.a;
   private static final int r = 100;
   private static final long s = 5L * bao.a;
   private static final long t = 10L * bao.b;
   private static final int u = 12;
   private static final int v = 5;
   private static final int w = 6000;
   private static final int x = 100;
   private static final int y = 3;
   public static final int c = 29999984;
   public static final dfq d = new dfq("Demo World", dfj.a, false, bsh.c, false, new dfi(crs.h), dgj.c);
   public static final GameProfile e = new GameProfile(ae.e, "Anonymous Player");
   protected final eub.c f;
   protected final eue g;
   private final List<Runnable> z = Lists.newArrayList();
   private bqk A = bqj.a;
   private Consumer<bos> B = $$0x -> this.aU();
   private Consumer<Path> C = $$0x -> {
   };
   private boolean D;
   @Nullable
   private MinecraftServer.c E;
   private boolean F;
   private final asr G;
   private final asa H;
   @Nullable
   private akg I;
   @Nullable
   private akg.a J;
   private final azu K = azu.a();
   private final DataFixer L;
   private String M;
   private int N = -1;
   private final jx<als> O;
   private final Map<ali<dfm>, arp> P = Maps.newLinkedHashMap();
   private avq Q;
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
   protected final ame i;
   private long ai;
   private final Thread aj;
   private long ak = ae.d();
   private long al = ae.d();
   private long am;
   private long an = ae.d();
   private boolean ao = false;
   private long ap;
   private boolean aq;
   private final aun ar;
   private final amc as = new amc(this);
   @Nullable
   private ets at;
   private final amm au = new amm();
   private final aly av;
   private boolean aw;
   private float ax;
   private final Executor ay;
   @Nullable
   private String az;
   private MinecraftServer.a aA;
   private final eql aB;
   private final amd aC;
   protected final euh j;
   private final cyk aD;
   private dtv aE;
   private int aF;
   private volatile boolean aG;
   private static final AtomicReference<RuntimeException> aH = new AtomicReference<>();
   private final amf aI = new amf();
   private final DiscontinuousFrame aJ;

   public static <S extends MinecraftServer> S a(Function<Thread, S> $$0) {
      AtomicReference<S> $$1 = new AtomicReference<>();
      Thread $$2 = new Thread(() -> $$1.get().y(), "Server thread");
      $$2.setUncaughtExceptionHandler(($$0x, $$1x) -> l.error("Uncaught exception in server thread", $$1x));
      if (Runtime.getRuntime().availableProcessors() > 4) {
         $$2.setPriority(8);
      }

      S $$3 = (S)$$0.apply($$2);
      $$1.set($$3);
      $$2.start();
      return $$3;
   }

   public MinecraftServer(Thread $$0, eub.c $$1, aun $$2, ami $$3, Proxy $$4, DataFixer $$5, ame $$6, asa $$7) {
      super("Server");
      this.O = $$3.c();
      this.j = $$3.d();
      if (!this.O.a().e(ma.bc).e(dzr.b)) {
         throw new IllegalStateException("Missing Overworld dimension data");
      } else {
         this.h = $$4;
         this.ar = $$2;
         this.aA = new MinecraftServer.a($$3.a(), $$3.b());
         this.i = $$6;
         if ($$6.f() != null) {
            $$6.f().a(this);
         }

         this.G = new asr(this);
         this.aC = new amd(this);
         this.H = $$7;
         this.f = $$1;
         this.g = $$1.g();
         this.L = $$5;
         this.av = new aly(this, this.aA.b.a());
         jr<diq> $$8 = this.O.a().e(ma.f).a(this.j.K());
         this.aB = new eql($$3.a(), $$1, $$5, $$8);
         this.aj = $$0;
         this.ay = ae.g();
         this.aD = cyk.a(this.j.K());
         this.aA.b.c().a();
         this.aE = dtv.a(this.O.a(), this.j.K());
         this.aJ = TracyClient.createDiscontinuousFrame("Server Tick");
      }
   }

   private void a(etv $$0) {
      $$0.a(this.aJ().b(), "scoreboard");
   }

   protected abstract boolean e() throws IOException;

   protected void u_() {
      if (!bpc.f.c()) {
      }

      boolean $$0 = false;
      bpf $$1 = bpc.f.e();
      this.j.a(this.getServerModName(), this.Q().a());
      arz $$2 = this.H.create(this.j.o().c(dfi.aa));
      this.a($$2);
      this.t();
      this.b($$2);
      if ($$1 != null) {
         $$1.finish();
      }

      if ($$0) {
         try {
            bpc.f.b();
         } catch (Throwable var5) {
            l.warn("Failed to stop JFR profiling", var5);
         }
      }
   }

   protected void t() {
   }

   protected void a(arz $$0) {
      eug $$1 = this.j.I();
      boolean $$2 = this.j.A();
      kd<dzr> $$3 = this.O.a().e(ma.bc);
      eco $$4 = this.j.y();
      long $$5 = $$4.c();
      long $$6 = dgq.a($$5);
      List<dey> $$7 = ImmutableList.of(new ecc(), new ecb(), new cob(), new cgj(), new com($$1));
      dzr $$8 = $$3.c(dzr.b);
      arp $$9 = new arp(this, this.ay, this.f, $$1, dfm.i, $$8, $$0, $$2, $$6, $$7, true, null);
      this.P.put(dfm.i, $$9);
      etv $$10 = $$9.v();
      this.a($$10);
      this.at = new ets($$10);
      dxl $$11 = $$9.E_();
      if (!$$1.n()) {
         try {
            a($$9, $$1, $$4.e(), $$2);
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

            throw new z($$13);
         }

         $$1.c(true);
      }

      this.ag().a($$9);
      if (this.j.E() != null) {
         this.aM().a(this.j.E(), this.ba());
      }

      bsp $$14 = $$9.M();

      for (Entry<ali<dzr>, dzr> $$15 : $$3.k()) {
         ali<dzr> $$16 = $$15.getKey();
         if ($$16 != dzr.b) {
            ali<dfm> $$17 = ali.a(ma.bb, $$16.a());
            etu $$18 = new etu(this.j, $$1);
            arp $$19 = new arp(this, this.ay, this.f, $$18, $$17, $$15.getValue(), $$0, $$2, $$6, ImmutableList.of(), false, $$14);
            $$11.a(new dxj.a($$19.E_()));
            this.P.put($$17, $$19);
         }
      }

      $$11.a($$1.p());
   }

   private static void a(arp $$0, eug $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         $$1.a(jh.c.b(80), 0.0F);
      } else {
         arm $$4 = $$0.m();
         des $$5 = new des($$4.i().b().a());
         int $$6 = $$4.g().a($$0);
         if ($$6 < $$0.K_()) {
            jh $$7 = $$5.l();
            $$6 = $$0.a(ebq.a.b, $$7.u() + 8, $$7.w() + 8);
         }

         $$1.a($$5.l().b(8, $$6, 8), 0.0F);
         int $$8 = 0;
         int $$9 = 0;
         int $$10 = 0;
         int $$11 = -1;

         for (int $$12 = 0; $$12 < azm.h(11); $$12++) {
            if ($$8 >= -5 && $$8 <= 5 && $$9 >= -5 && $$9 <= 5) {
               jh $$13 = arj.a($$0, new des($$5.g + $$8, $$5.h + $$9));
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
            $$0.J_().a(ma.aJ).flatMap($$0x -> $$0x.a(sb.m)).ifPresent($$3x -> ((eei)$$3x.a()).a($$0, $$4.g(), $$0.A, $$1.a()));
         }
      }
   }

   private void a(euh $$0) {
      $$0.a(bsh.a);
      $$0.d(true);
      eug $$1 = $$0.I();
      $$1.b(false);
      $$1.a(false);
      $$1.a(1000000000);
      $$1.b(6000L);
      $$1.a(dfj.d);
   }

   private void b(arz $$0) {
      arp $$1 = this.J();
      l.info("Preparing start region for dimension {}", $$1.ag().a());
      jh $$2 = $$1.X();
      $$0.a(new des($$2));
      arm $$3 = $$1.m();
      this.an = ae.d();
      $$1.a($$2, $$1.Y());
      int $$4 = this.aL().c(dfi.aa);
      int $$5 = $$4 > 0 ? azm.h(arz.a($$4)) : 0;

      while ($$3.b() < $$5) {
         this.an = ae.d() + t;
         this.w_();
      }

      this.an = ae.d() + t;
      this.w_();

      for (arp $$6 : this.P.values()) {
         dfh $$7 = $$6.v().b(dfh.a(), "chunks");
         if ($$7 != null) {
            LongIterator $$8 = $$7.b().iterator();

            while ($$8.hasNext()) {
               long $$9 = $$8.nextLong();
               des $$10 = new des($$9);
               $$6.m().a($$10, true);
            }
         }
      }

      this.an = ae.d() + t;
      this.w_();
      $$0.b();
      this.bH();
   }

   public dfj u() {
      return this.j.k();
   }

   public boolean v_() {
      return this.j.l();
   }

   public abstract int k();

   public abstract int l();

   public abstract boolean m();

   public boolean a(boolean $$0, boolean $$1, boolean $$2) {
      boolean $$3 = false;

      for (arp $$4 : this.L()) {
         if (!$$0) {
            l.info("Saving chunks for level '{}'/{}", $$4, $$4.ag().a());
         }

         $$4.a(null, $$1, $$4.e && !$$2);
         $$3 = true;
      }

      arp $$5 = this.J();
      eug $$6 = this.j.I();
      $$6.a($$5.E_().t());
      this.j.a(this.aM().a(this.ba()));
      this.f.a(this.ba(), this.j, this.ag().r());
      if ($$1) {
         for (arp $$7 : this.L()) {
            l.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", $$7.m().a.n());
         }

         l.info("ThreadedAnvilChunkStorage: All dimensions are saved");
      }

      return $$3;
   }

   public boolean b(boolean $$0, boolean $$1, boolean $$2) {
      boolean var4;
      try {
         this.aG = true;
         this.ag().h();
         var4 = this.a($$0, $$1, $$2);
      } finally {
         this.aG = false;
      }

      return var4;
   }

   @Override
   public void close() {
      this.v();
   }

   public void v() {
      if (this.A.e()) {
         this.aW();
      }

      l.info("Stopping server");
      this.ah().b();
      this.aG = true;
      if (this.Q != null) {
         l.info("Saving players");
         this.Q.h();
         this.Q.s();
      }

      l.info("Saving worlds");

      for (arp $$0 : this.L()) {
         if ($$0 != null) {
            $$0.e = false;
         }
      }

      while (this.P.values().stream().anyMatch($$0x -> $$0x.m().a.e())) {
         this.an = ae.d() + bao.b;

         for (arp $$1 : this.L()) {
            $$1.m().o();
            $$1.m().a(() -> true, false);
         }

         this.w_();
      }

      this.a(false, true, false);

      for (arp $$2 : this.L()) {
         if ($$2 != null) {
            try {
               $$2.close();
            } catch (IOException var5) {
               l.error("Exception closing the level", var5);
            }
         }
      }

      this.aG = false;
      this.aA.close();

      try {
         this.f.close();
      } catch (IOException var4) {
         l.error("Failed to unlock level {}", this.f.f(), var4);
      }
   }

   public String w() {
      return this.M;
   }

   public void a_(String $$0) {
      this.M = $$0;
   }

   public boolean x() {
      return this.R;
   }

   public void a(boolean $$0) {
      this.R = false;
      if ($$0) {
         try {
            this.aj.join();
         } catch (InterruptedException var3) {
            l.error("Error while shutting down", var3);
         }
      }
   }

   protected void y() {
      try {
         if (!this.e()) {
            throw new IllegalStateException("Failed to initialize server");
         }

         this.an = ae.d();
         this.J = this.bC().orElse(null);
         this.I = this.bF();

         while (this.R) {
            long $$0;
            if (!this.E() && this.aC.a() && this.aC.d()) {
               $$0 = 0L;
               this.an = ae.d();
               this.ah = this.an;
            } else {
               $$0 = this.aC.h();
               long $$2 = ae.d() - this.an;
               if ($$2 > o + 20L * $$0 && this.an - this.ah >= q + 100L * $$0) {
                  long $$3 = $$2 / $$0;
                  l.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", $$2 / bao.b, $$3);
                  this.an += $$3 * $$0;
                  this.ah = this.an;
               }
            }

            boolean $$4 = $$0 == 0L;
            if (this.F) {
               this.F = false;
               this.E = new MinecraftServer.c(ae.d(), this.T);
            }

            this.an += $$0;

            try (bot.a $$5 = bot.a(this.bI())) {
               bou $$6 = bot.a();
               $$6.a("tick");
               this.aJ.start();
               this.a($$4 ? () -> false : this::bu);
               this.aJ.end();
               $$6.b("nextTickWait");
               this.aq = true;
               this.ap = Math.max(ae.d() + $$0, this.an);
               this.bs();
               this.w_();
               this.bt();
               if ($$4) {
                  this.aC.e();
               }

               $$6.c();
               this.br();
            } finally {
               this.aS();
            }

            this.ag = true;
            bpc.f.a(this.ax);
         }
      } catch (Throwable var69) {
         l.error("Encountered an unexpected exception", var69);
         o $$9 = b(var69);
         this.b($$9.f());
         Path $$10 = this.D().resolve("crash-reports").resolve("crash-" + ae.f() + "-server.txt");
         if ($$9.a($$10, y.a)) {
            l.error("This crash report has been saved to: {}", $$10.toAbsolutePath());
         } else {
            l.error("We were unable to save this crash report to disk.");
         }

         this.a($$9);
      } finally {
         try {
            this.S = true;
            this.v();
         } catch (Throwable var64) {
            l.error("Exception stopping the server", var64);
         } finally {
            if (this.i.f() != null) {
               this.i.f().a();
            }

            this.i();
         }
      }
   }

   private void br() {
      long $$0 = ae.d();
      if (this.g()) {
         this.f().a($$0 - this.ak);
      }

      this.ak = $$0;
   }

   private void bs() {
      if (this.g()) {
         this.al = ae.d();
         this.am = 0L;
      }
   }

   private void bt() {
      if (this.g()) {
         bnh $$0 = this.f();
         $$0.a(ae.d() - this.al - this.am, bnj.c.ordinal());
         $$0.a(this.am, bnj.d.ordinal());
      }
   }

   private static o b(Throwable $$0) {
      z $$1 = null;

      for (Throwable $$2 = $$0; $$2 != null; $$2 = $$2.getCause()) {
         if ($$2 instanceof z $$3) {
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

   private boolean bu() {
      return this.bB() || ae.d() < (this.aq ? this.ap : this.an);
   }

   public static boolean z() {
      RuntimeException $$0 = aH.get();
      if ($$0 != null) {
         throw $$0;
      } else {
         return true;
      }
   }

   public static void a(RuntimeException $$0) {
      aH.compareAndSet(null, $$0);
   }

   @Override
   public void b(BooleanSupplier $$0) {
      super.b(() -> z() && $$0.getAsBoolean());
   }

   protected void w_() {
      this.bA();
      this.ao = true;

      try {
         this.b((BooleanSupplier)(() -> !this.bu()));
      } finally {
         this.ao = false;
      }
   }

   @Override
   public void A() {
      boolean $$0 = this.g();
      long $$1 = $$0 ? ae.d() : 0L;
      long $$2 = this.ao ? this.an - ae.d() : 100000L;
      LockSupport.parkNanos("waiting for tasks", $$2);
      if ($$0) {
         this.am = this.am + (ae.d() - $$1);
      }
   }

   public amg a(Runnable $$0) {
      return new amg(this.T, $$0);
   }

   protected boolean a(amg $$0) {
      return $$0.a() + 3 < this.T || this.bu();
   }

   @Override
   public boolean B() {
      boolean $$0 = this.bv();
      this.aq = $$0;
      return $$0;
   }

   private boolean bv() {
      if (super.B()) {
         return true;
      } else {
         if (this.aC.a() || this.bu()) {
            for (arp $$0 : this.L()) {
               if ($$0.m().d()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   protected void b(amg $$0) {
      bot.a().f("runTask");
      super.d($$0);
   }

   private Optional<akg.a> bC() {
      Optional<Path> $$0 = Optional.of(this.c("server-icon.png"))
         .filter($$0x -> Files.isRegularFile($$0x))
         .or(() -> this.f.j().filter($$0x -> Files.isRegularFile($$0x)));
      return $$0.flatMap($$0x -> {
         try {
            BufferedImage $$1 = ImageIO.read($$0x.toFile());
            Preconditions.checkState($$1.getWidth() == 64, "Must be 64 pixels wide");
            Preconditions.checkState($$1.getHeight() == 64, "Must be 64 pixels high");
            ByteArrayOutputStream $$2 = new ByteArrayOutputStream();
            ImageIO.write($$1, "PNG", $$2);
            return Optional.of(new akg.a($$2.toByteArray()));
         } catch (Exception var3) {
            l.error("Couldn't load server icon", var3);
            return Optional.empty();
         }
      });
   }

   public Optional<Path> C() {
      return this.f.j();
   }

   public Path D() {
      return Path.of("");
   }

   public void a(o $$0) {
   }

   public void i() {
   }

   public boolean E() {
      return false;
   }

   public void a(BooleanSupplier $$0) {
      long $$1 = ae.d();
      int $$2 = this.bq() * 20;
      if ($$2 > 0) {
         if (this.Q.m() == 0 && !this.aC.a()) {
            this.aF++;
         } else {
            this.aF = 0;
         }

         if (this.aF >= $$2) {
            if (this.aF == $$2) {
               l.info("Server empty for {} seconds, pausing", this.bq());
               this.bD();
            }

            this.G();
            return;
         }
      }

      this.T++;
      this.aC.m();
      this.c($$0);
      if ($$1 - this.ai >= s) {
         this.ai = $$1;
         this.I = this.bF();
      }

      this.U--;
      if (this.U <= 0) {
         this.bD();
      }

      bou $$3 = bot.a();
      $$3.a("tallying");
      long $$4 = ae.d() - $$1;
      int $$5 = this.T % 100;
      this.ac = this.ac - this.ab[$$5];
      this.ac += $$4;
      this.ab[$$5] = $$4;
      this.ax = this.ax * 0.8F + (float)$$4 / (float)bao.b * 0.19999999F;
      this.a($$1);
      $$3.c();
   }

   private void bD() {
      this.U = this.bE();
      l.debug("Autosave started");
      bou $$0 = bot.a();
      $$0.a("save");
      this.b(true, false, false);
      $$0.c();
      l.debug("Autosave finished");
   }

   private void a(long $$0) {
      if (this.g()) {
         this.f().a(ae.d() - $$0, bnj.b.ordinal());
      }
   }

   private int bE() {
      float $$1;
      if (this.aC.a()) {
         long $$0 = this.aQ() + 1L;
         $$1 = (float)bao.a / (float)$$0;
      } else {
         $$1 = this.aC.f();
      }

      int $$3 = 300;
      return Math.max(100, (int)($$1 * 300.0F));
   }

   public void F() {
      int $$0 = this.bE();
      if ($$0 < this.U) {
         this.U = $$0;
      }
   }

   protected abstract bnh f();

   public abstract boolean g();

   private akg bF() {
      akg.b $$0 = this.bG();
      return new akg(xj.a(this.Z), Optional.of($$0), Optional.of(akg.c.a()), Optional.ofNullable(this.J), this.aA());
   }

   private akg.b bG() {
      List<arq> $$0 = this.Q.t();
      int $$1 = this.O();
      if (this.an()) {
         return new akg.b($$1, $$0.size(), List.of());
      } else {
         int $$2 = Math.min($$0.size(), 12);
         ObjectArrayList<GameProfile> $$3 = new ObjectArrayList($$2);
         int $$4 = azm.a(this.K, 0, $$0.size() - $$2);

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            arq $$6 = $$0.get($$4 + $$5);
            $$3.add($$6.ab() ? $$6.gf() : e);
         }

         ae.c($$3, this.K);
         return new akg.b($$1, $$0.size(), $$3);
      }
   }

   protected void c(BooleanSupplier $$0) {
      bou $$1 = bot.a();
      this.ag().t().forEach($$0x -> $$0x.f.f());
      $$1.a("commandFunctions");
      this.aE().b();
      $$1.b("levels");

      for (arp $$2 : this.L()) {
         $$1.a(() -> $$2 + " " + $$2.ag().a());
         if (this.T % 20 == 0) {
            $$1.a("timeSync");
            this.b($$2);
            $$1.c();
         }

         $$1.a("tick");

         try {
            $$2.a($$0);
         } catch (Throwable var7) {
            o $$4 = o.a(var7, "Exception ticking world");
            $$2.a($$4);
            throw new z($$4);
         }

         $$1.c();
         $$1.c();
      }

      $$1.b("connection");
      this.G();
      $$1.b("players");
      this.Q.d();
      if (ab.aU && this.aC.i()) {
         tm.a.b();
      }

      $$1.b("server gui refresh");

      for (int $$5 = 0; $$5 < this.z.size(); $$5++) {
         this.z.get($$5).run();
      }

      $$1.b("send chunks");

      for (arq $$6 : this.Q.t()) {
         $$6.f.g.a($$6);
         $$6.f.g();
      }

      $$1.c();
   }

   public void G() {
      this.ah().c();
   }

   private void b(arp $$0) {
      this.Q.a(new afz($$0.ab(), $$0.ac(), $$0.N().b(dfi.l)), $$0.ag());
   }

   public void H() {
      bou $$0 = bot.a();
      $$0.a("timeSync");

      for (arp $$1 : this.L()) {
         this.b($$1);
      }

      $$0.c();
   }

   public boolean a(dfm $$0) {
      return true;
   }

   public void b(Runnable $$0) {
      this.z.add($$0);
   }

   protected void b(String $$0) {
      this.az = $$0;
   }

   public boolean I() {
      return !this.aj.isAlive();
   }

   public Path c(String $$0) {
      return this.D().resolve($$0);
   }

   public final arp J() {
      return this.P.get(dfm.i);
   }

   @Nullable
   public arp a(ali<dfm> $$0) {
      return this.P.get($$0);
   }

   public Set<ali<dfm>> K() {
      return this.P.keySet();
   }

   public Iterable<arp> L() {
      return this.P.values();
   }

   @Override
   public String M() {
      return ab.b().c();
   }

   @Override
   public int N() {
      return this.Q.m();
   }

   @Override
   public int O() {
      return this.Q.n();
   }

   public String[] P() {
      return this.Q.e();
   }

   @DontObfuscate
   public String getServerModName() {
      return "vanilla";
   }

   public ac b(ac $$0) {
      $$0.a("Server Running", () -> Boolean.toString(this.R));
      if (this.Q != null) {
         $$0.a("Player Count", () -> this.Q.m() + " / " + this.Q.n() + "; " + this.Q.t());
      }

      $$0.a("Active Data Packs", () -> aun.a(this.ar.g()));
      $$0.a("Available Data Packs", () -> aun.a(this.ar.d()));
      $$0.a("Enabled Feature Flags", () -> crs.e.b(this.j.K()).stream().map(alj::toString).collect(Collectors.joining(", ")));
      $$0.a("World Generation", () -> this.j.B().toString());
      $$0.a("World Seed", () -> String.valueOf(this.j.y().c()));
      $$0.a("Suppressed Exceptions", this.aI::a);
      if (this.az != null) {
         $$0.a("Server Id", () -> this.az);
      }

      return this.a($$0);
   }

   public abstract ac a(ac var1);

   public azl Q() {
      return azl.a("vanilla", this::getServerModName, "Server", MinecraftServer.class);
   }

   @Override
   public void a(xj $$0) {
      l.info($$0.getString());
   }

   public KeyPair R() {
      return this.ad;
   }

   public int S() {
      return this.N;
   }

   public void a(int $$0) {
      this.N = $$0;
   }

   @Nullable
   public GameProfile T() {
      return this.ae;
   }

   public void b(@Nullable GameProfile $$0) {
      this.ae = $$0;
   }

   public boolean U() {
      return this.ae != null;
   }

   protected void V() {
      l.info("Generating keypair");

      try {
         this.ad = ayk.b();
      } catch (ayl var2) {
         throw new IllegalStateException("Failed to generate key pair", var2);
      }
   }

   public void a(bsh $$0, boolean $$1) {
      if ($$1 || !this.j.r()) {
         this.j.a(this.j.l() ? bsh.d : $$0);
         this.bH();
         this.ag().t().forEach(this::c);
      }
   }

   public int b(int $$0) {
      return $$0;
   }

   private void bH() {
      for (arp $$0 : this.L()) {
         $$0.a(this.W());
      }
   }

   public void b(boolean $$0) {
      this.j.d($$0);
      this.ag().t().forEach(this::c);
   }

   private void c(arq $$0) {
      etx $$1 = $$0.dV().C_();
      $$0.f.b(new acs($$1.q(), $$1.r()));
   }

   public boolean W() {
      return this.j.q() != bsh.a;
   }

   public boolean X() {
      return this.af;
   }

   public void c(boolean $$0) {
      this.af = $$0;
   }

   public Optional<MinecraftServer.b> Y() {
      return Optional.empty();
   }

   public boolean Z() {
      return this.Y().filter(MinecraftServer.b::d).isPresent();
   }

   public abstract boolean n();

   public abstract int o();

   public boolean aa() {
      return this.V;
   }

   public void d(boolean $$0) {
      this.V = $$0;
   }

   public boolean ab() {
      return this.W;
   }

   public void e(boolean $$0) {
      this.W = $$0;
   }

   public abstract boolean p();

   public boolean ac() {
      return this.X;
   }

   public void f(boolean $$0) {
      this.X = $$0;
   }

   public boolean ad() {
      return this.Y;
   }

   public void g(boolean $$0) {
      this.Y = $$0;
   }

   public abstract boolean q();

   @Override
   public String ae() {
      return this.Z;
   }

   public void d(String $$0) {
      this.Z = $$0;
   }

   public boolean af() {
      return this.S;
   }

   public avq ag() {
      return this.Q;
   }

   public void a(avq $$0) {
      this.Q = $$0;
   }

   public abstract boolean r();

   public void a(dfj $$0) {
      this.j.a($$0);
   }

   public asr ah() {
      return this.G;
   }

   public boolean ai() {
      return this.ag;
   }

   public boolean aj() {
      return false;
   }

   public boolean a(@Nullable dfj $$0, boolean $$1, int $$2) {
      return false;
   }

   public int ak() {
      return this.T;
   }

   public int al() {
      return 16;
   }

   public boolean a(arp $$0, jh $$1, cou $$2) {
      return false;
   }

   public boolean am() {
      return true;
   }

   public boolean an() {
      return false;
   }

   public Proxy ao() {
      return this.h;
   }

   public int ap() {
      return this.aa;
   }

   public void c(int $$0) {
      this.aa = $$0;
   }

   public MinecraftSessionService aq() {
      return this.i.c();
   }

   @Nullable
   public azz ar() {
      return this.i.a();
   }

   public GameProfileRepository as() {
      return this.i.e();
   }

   @Nullable
   public avm at() {
      return this.i.f();
   }

   @Nullable
   public akg au() {
      return this.I;
   }

   public void av() {
      this.ai = 0L;
   }

   public int aw() {
      return 29999984;
   }

   @Override
   public boolean ax() {
      return super.ax() && !this.af();
   }

   @Override
   public void c(Runnable $$0) {
      if (this.af()) {
         throw new RejectedExecutionException("Server already shutting down");
      } else {
         super.c($$0);
      }
   }

   @Override
   public Thread ay() {
      return this.aj;
   }

   public int az() {
      return 256;
   }

   public boolean aA() {
      return false;
   }

   public long aB() {
      return this.an;
   }

   public DataFixer aC() {
      return this.L;
   }

   public int a(@Nullable arp $$0) {
      return $$0 != null ? $$0.N().c(dfi.s) : 10;
   }

   public alw aD() {
      return this.aA.b.e();
   }

   public aly aE() {
      return this.av;
   }

   public CompletableFuture<Void> a(Collection<String> $$0) {
      CompletableFuture<Void> $$1 = CompletableFuture.<ImmutableList>supplyAsync(
            () -> $$0.stream().map(this.ar::c).filter(Objects::nonNull).map(auk::f).collect(ImmutableList.toImmutableList()), this
         )
         .thenCompose($$0x -> {
            aus $$1x = new auv(atq.b, $$0x);
            List<kd.a<?>> $$2 = axt.a($$1x, this.O.a());
            return alu.a($$1x, this.O, $$2, this.j.K(), this.n() ? ex.a.b : ex.a.c, this.l(), this.ay, this).whenComplete(($$1xx, $$2x) -> {
               if ($$2x != null) {
                  $$1x.close();
               }
            }).thenApply($$1xx -> new MinecraftServer.a($$1x, $$1xx));
         })
         .thenAcceptAsync($$1x -> {
            this.aA.close();
            this.aA = $$1x;
            this.ar.b($$0);
            dgj $$2 = new dgj(a(this.ar, true), this.j.K());
            this.j.a($$2);
            this.aA.b.g();
            this.aA.b.c().a();
            this.ag().h();
            this.ag().u();
            this.av.a(this.aA.b.a());
            this.aB.a(this.aA.a);
            this.aE = dtv.a(this.O.a(), this.j.K());
         }, this);
      if (this.bx()) {
         this.b($$1::isDone);
      }

      return $$1;
   }

   public static dgj a(aun $$0, dgj $$1, boolean $$2, boolean $$3) {
      dez $$4 = $$1.a();
      crq $$5 = $$2 ? crq.a() : $$1.b();
      crq $$6 = $$2 ? crs.e.a() : $$1.b();
      $$0.a();
      if ($$3) {
         return a($$0, List.of("vanilla"), $$5, false);
      } else {
         Set<String> $$7 = Sets.newLinkedHashSet();

         for (String $$8 : $$4.a()) {
            if ($$0.d($$8)) {
               $$7.add($$8);
            } else {
               l.warn("Missing data pack {}", $$8);
            }
         }

         for (auk $$9 : $$0.d()) {
            String $$10 = $$9.g();
            if (!$$4.b().contains($$10)) {
               crq $$11 = $$9.e();
               boolean $$12 = $$7.contains($$10);
               if (!$$12 && $$9.l().a()) {
                  if ($$11.a($$6)) {
                     l.info("Found new data pack {}, loading it automatically", $$10);
                     $$7.add($$10);
                  } else {
                     l.info("Found new data pack {}, but can't load it due to missing features {}", $$10, crs.a($$6, $$11));
                  }
               }

               if ($$12 && !$$11.a($$6)) {
                  l.warn("Pack {} requires features {} that are not enabled for this world, disabling pack.", $$10, crs.a($$6, $$11));
                  $$7.remove($$10);
               }
            }
         }

         if ($$7.isEmpty()) {
            l.info("No datapacks selected, forcing vanilla");
            $$7.add("vanilla");
         }

         return a($$0, $$7, $$5, true);
      }
   }

   private static dgj a(aun $$0, Collection<String> $$1, crq $$2, boolean $$3) {
      $$0.b($$1);
      a($$0, $$2);
      dez $$4 = a($$0, $$3);
      crq $$5 = $$0.f().c($$2);
      return new dgj($$4, $$5);
   }

   private static void a(aun $$0, crq $$1) {
      crq $$2 = $$0.f();
      crq $$3 = $$1.d($$2);
      if (!$$3.b()) {
         Set<String> $$4 = new ObjectArraySet($$0.e());

         for (auk $$5 : $$0.d()) {
            if ($$3.b()) {
               break;
            }

            if ($$5.l() == auo.d) {
               String $$6 = $$5.g();
               crq $$7 = $$5.e();
               if (!$$7.b() && $$7.b($$3) && $$7.a($$1)) {
                  if (!$$4.add($$6)) {
                     throw new IllegalStateException("Tried to force '" + $$6 + "', but it was already enabled");
                  }

                  l.info("Found feature pack ('{}') for requested feature, forcing to enabled", $$6);
                  $$3 = $$3.d($$7);
               }
            }
         }

         $$0.b($$4);
      }
   }

   private static dez a(aun $$0, boolean $$1) {
      Collection<String> $$2 = $$0.e();
      List<String> $$3 = ImmutableList.copyOf($$2);
      List<String> $$4 = $$1 ? $$0.c().stream().filter($$1x -> !$$2.contains($$1x)).toList() : List.of();
      return new dez($$3, $$4);
   }

   public void a(ew $$0) {
      if (this.aN()) {
         avq $$1 = $$0.l().ag();
         avy $$2 = $$1.i();

         for (arq $$4 : Lists.newArrayList($$1.t())) {
            if (!$$2.a($$4.gf())) {
               $$4.f.a(xj.c("multiplayer.disconnect.not_whitelisted"));
            }
         }
      }
   }

   public aun aF() {
      return this.ar;
   }

   public ex aG() {
      return this.aA.b.d();
   }

   public ew aH() {
      arp $$0 = this.J();
      return new ew(this, $$0 == null ? ezy.c : ezy.a($$0.X()), ezx.a, $$0, 4, "Server", xj.b("Server"), this, null);
   }

   @Override
   public boolean x_() {
      return true;
   }

   @Override
   public boolean y_() {
      return true;
   }

   @Override
   public abstract boolean c();

   public dbe aI() {
      return this.aA.b.c();
   }

   public amc aJ() {
      return this.as;
   }

   public ets aK() {
      if (this.at == null) {
         throw new NullPointerException("Called before server init");
      } else {
         return this.at;
      }
   }

   public dfi aL() {
      return this.J().N();
   }

   public amm aM() {
      return this.au;
   }

   public boolean aN() {
      return this.aw;
   }

   public void h(boolean $$0) {
      this.aw = $$0;
   }

   public float aO() {
      return this.ax;
   }

   public amd aP() {
      return this.aC;
   }

   public long aQ() {
      return this.ac / (long)Math.min(100, Math.max(this.T, 1));
   }

   public long[] aR() {
      return this.ab;
   }

   public int c(GameProfile $$0) {
      if (this.ag().f($$0)) {
         avs $$1 = this.ag().k().b($$0);
         if ($$1 != null) {
            return $$1.a();
         } else if (this.a($$0)) {
            return 4;
         } else if (this.U()) {
            return this.ag().v() ? 4 : 0;
         } else {
            return this.k();
         }
      } else {
         return 0;
      }
   }

   public abstract boolean a(GameProfile var1);

   public void a(Path $$0) throws IOException {
   }

   private void b(Path $$0) {
      Path $$1 = $$0.resolve("levels");

      try {
         for (Entry<ali<dfm>, arp> $$2 : this.P.entrySet()) {
            alj $$3 = $$2.getKey().a();
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
         l.warn("Failed to save debug report", var7);
      }
   }

   private void c(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         $$1.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.by()));
         $$1.write(String.format(Locale.ROOT, "average_tick_time: %f\n", this.aO()));
         $$1.write(String.format(Locale.ROOT, "tick_times: %s\n", Arrays.toString(this.ab)));
         $$1.write(String.format(Locale.ROOT, "queue: %s\n", ae.g()));
      }
   }

   private void d(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         final List<String> $$2 = Lists.newArrayList();
         final dfi $$3 = this.aL();
         $$3.a(new dfi.c() {
            @Override
            public <T extends dfi.g<T>> void a(dfi.e<T> $$0, dfi.f<T> $$1) {
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
         List<azn.a> $$2;
         try {
            $$2 = Lists.newArrayList(azn.a());
         } catch (Throwable var7) {
            l.warn("Failed to list native modules", var7);
            return;
         }

         $$2.sort(Comparator.comparing($$0x -> $$0x.a));

         for (azn.a $$5 : $$2) {
            $$1.write($$5.toString());
            $$1.write(10);
         }
      }
   }

   private bou bI() {
      if (this.D) {
         this.A = bqi.a(new bqm(ae.c, this.n()), ae.c, ae.h(), new bqo("server"), this.B, $$0 -> {
            this.h(() -> this.b($$0.resolve("server")));
            this.C.accept($$0);
         });
         this.D = false;
      }

      this.A.c();
      return box.a(this.A.f(), box.a("Server"));
   }

   public void aS() {
      this.A.d();
   }

   public boolean aT() {
      return this.A.e();
   }

   public void a(Consumer<bos> $$0, Consumer<Path> $$1) {
      this.B = $$1x -> {
         this.aU();
         $$0.accept($$1x);
      };
      this.C = $$1;
      this.D = true;
   }

   public void aU() {
      this.A = bqj.a;
   }

   public void aV() {
      this.A.a();
   }

   public void aW() {
      this.A.b();
   }

   public Path a(etz $$0) {
      return this.f.a($$0);
   }

   public boolean aX() {
      return true;
   }

   public eql aY() {
      return this.aB;
   }

   public euh aZ() {
      return this.j;
   }

   public ke.b ba() {
      return this.O.a();
   }

   public jx<als> bb() {
      return this.O;
   }

   public alt.a bc() {
      return this.aA.b.b();
   }

   public asy a(arq $$0) {
      return asy.e;
   }

   public arr b(arq $$0) {
      return (arr)(this.X() ? new arc($$0) : new arr($$0));
   }

   @Nullable
   public dfj bd() {
      return null;
   }

   public avd be() {
      return this.aA.a;
   }

   public boolean bf() {
      return this.aG;
   }

   public boolean bg() {
      return this.F || this.E != null;
   }

   public void bh() {
      this.F = true;
   }

   public bos bi() {
      if (this.E == null) {
         return boo.a;
      } else {
         bos $$0 = this.E.a(ae.d(), this.T);
         this.E = null;
         return $$0;
      }
   }

   public int bj() {
      return 1000000;
   }

   public void a(xj $$0, xf.a $$1, @Nullable String $$2) {
      String $$3 = $$1.a($$0).getString();
      if ($$2 != null) {
         l.info("[{}] {}", $$2, $$3);
      } else {
         l.info("{}", $$3);
      }
   }

   public xe bk() {
      return xe.a;
   }

   public boolean bl() {
      return true;
   }

   public void a(arq $$0, bnf $$1) {
   }

   public boolean bm() {
      return false;
   }

   private void a(o $$0, des $$1, dzj $$2) {
      ae.h().execute(() -> {
         try {
            Path $$3 = this.c("debug");
            v.c($$3);
            String $$4 = v.a($$2.a());
            Path $$5 = $$3.resolve("chunk-" + $$4 + "-" + ae.f() + "-server.txt");
            FileStore $$6 = Files.getFileStore($$3);
            long $$7 = $$6.getUsableSpace();
            if ($$7 < 8192L) {
               l.warn("Not storing chunk IO report due to low space on drive {}", $$6.name());
               return;
            }

            p $$8 = $$0.a("Chunk Info");
            $$8.a("Level", $$2::a);
            $$8.a("Dimension", () -> $$2.b().a().toString());
            $$8.a("Storage", $$2::c);
            $$8.a("Position", $$1::toString);
            $$0.a($$5, y.e);
            l.info("Saved details to {}", $$0.e());
         } catch (Exception var11) {
            l.warn("Failed to store chunk IO exception", var11);
         }
      });
   }

   @Override
   public void a(Throwable $$0, dzj $$1, des $$2) {
      l.error("Failed to load chunk {},{}", new Object[]{$$2.g, $$2.h, $$0});
      this.aI.a("chunk/load", $$0);
      this.a(o.a($$0, "Chunk load failure"), $$2, $$1);
   }

   @Override
   public void b(Throwable $$0, dzj $$1, des $$2) {
      l.error("Failed to save chunk {},{}", new Object[]{$$2.g, $$2.h, $$0});
      this.aI.a("chunk/save", $$0);
      this.a(o.a($$0, "Chunk save failure"), $$2, $$1);
   }

   public void a(Throwable $$0, zs<?> $$1) {
      this.aI.a("packet/" + $$1.toString(), $$0);
   }

   public cyk bn() {
      return this.aD;
   }

   public dtv bo() {
      return this.aE;
   }

   public amb bp() {
      return amb.a;
   }

   protected int bq() {
      return 0;
   }

   static record a(aus a, alu b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.close();
      }
   }

   public static record b(UUID a, String b, String c, boolean d, @Nullable xj e) {
   }

   static class c {
      final long a;
      final int b;

      c(long $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      bos a(final long $$0, final int $$1) {
         return new bos() {
            @Override
            public List<bow> a(String $$0x) {
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
