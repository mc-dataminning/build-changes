import com.mojang.brigadier.exceptions.CommandSyntaxException;

@FunctionalInterface
public interface gm<T> {
   void execute(gn<T> var1, int var2) throws CommandSyntaxException;
}
